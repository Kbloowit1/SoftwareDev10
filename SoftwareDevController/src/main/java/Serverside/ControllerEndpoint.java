package Serverside;


import Controller.ControllerService;
import Controller.StoplichtenSetter;
import Controller.Verkeer;


import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

@ServerEndpoint(value="/controller",
encoders = JsonEncoder.class,
decoders = JsonDecoder.class)
public class ControllerEndpoint {

    private Session session;
    private ControllerService controllerService = new ControllerService();
    private StoplichtenSetter setter = new StoplichtenSetter();
    private Verkeer verkeer = new Verkeer();
    private final int Max_groentijdseconden = 10;
    private final ReentrantLock loser = new ReentrantLock();
    private boolean working = false;
    private Stoplichten status;


    @OnOpen
    public void onOpen(Session session){
        this.session = session;
    }

    @OnMessage
    public void onMessage(final Session session, final Verkeer message) throws InterruptedException, IOException {
        if(!working) {
            working = true;
            status = setter.SetLights(message);

            try{
                session.getBasicRemote().sendObject(status);
            }
            catch(EncodeException e){
                 System.out.println("Green Fail");
                 working = false;
            }



            Timer timer = new Timer();
            TimerTask orange = new TimerTask(){
                public void run(){
                    try {

                        session.getBasicRemote().sendObject(setter.SetOrange(status));

                    } catch(IOException | EncodeException | InterruptedException e)
                    {
                        System.out.println("Orange Fail");
                        working = false;
                    }

                }
            };
            timer.schedule(orange, 4000);

            TimerTask red = new TimerTask() {
                @Override
                public void run() {
                    try {
                        session.getBasicRemote().sendObject(setter.SetRed(status));
                    } catch (IOException | EncodeException  e) {
                       System.out.println("Red fail");
                       working = false;
                    }

                }
            };

            timer.schedule(red, 3500);

            working = false;

        }
        else{
            System.out.println("its working");
        }
        //TODO: Oude code op deze manier implementeren, dan werkt die kutzooi eindelijk



        
    }


}
