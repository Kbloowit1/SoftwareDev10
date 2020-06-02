package Serverside;


import Controller.StoplichtenSetter;
import Controller.Verkeer;


import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;


@ServerEndpoint(value="/controller",
encoders = JsonEncoder.class,
decoders = JsonDecoder.class)
public class ControllerEndpoint {

    private Session session;
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
            status = setter.SetGreen(message);

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
        // Ignore any incoming messages while in a cycle
        else{
            System.out.println("its working");
        }

    }




}
