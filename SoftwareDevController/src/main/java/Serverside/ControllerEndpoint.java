package Serverside;


import Controller.ControllerService;
import Controller.StoplichtenSetter;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint(value="/controller",
encoders = JsonEncoder.class,
decoders = JsonDecoder.class)
public class ControllerEndpoint {

    private Session session;
    private ControllerService service = new ControllerService();
    private StoplichtenSetter setter = new StoplichtenSetter();


    @OnOpen
    public void onOpen(Session session){
        this.session = session;


        try{
            System.out.println(session.getBasicRemote());
            session.getBasicRemote().sendObject(service.buildStoplicht());
        }
        catch (IOException | EncodeException e)
        {
            System.out.println("you fucked up bad dude");
        }



    }

    @OnMessage
    public void onMessage(Session session, String message){
        System.out.println(message);
        //setter.FindBusiestRoad(message);

        try{
            session.getBasicRemote().sendText(message);
        }
        catch (IOException e)
        {
            System.out.println("you fucked up bad dude");
        }
        
    }


}
