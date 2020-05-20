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



            TimerTask red = new TimerTask() {
                @Override
                public void run() {
                    try {
                        System.out.println("Do i get here");
                        session.getBasicRemote().sendObject(setter.SetRed(status));
                    } catch (IOException | EncodeException  e) {
                       System.out.println("Red fail");
                       working = false;
                    }
                }
            };

            TimerTask waitforred = new TimerTask() {
                @Override
                public void run() {
                    working = false;
                }
            };

            timer.schedule(orange, 8000);
            timer.schedule(red, 11500);
            timer.schedule(waitforred, 17500);
        }
        else{
            System.out.println("its working");
        }

    }




}
