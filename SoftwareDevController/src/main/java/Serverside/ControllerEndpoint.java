package Serverside;


import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint("/controller")
public class ControllerEndpoint {

    private Session session;


    @OnOpen
    public void onOpen(Session session){
        this.session = session;

        try{
            System.out.println(session.getBasicRemote());
            session.getBasicRemote().sendText("connected good yes");
        }
        catch (IOException e)
        {
            System.out.println("you fucked up bad dude");
        }



    }

    @OnMessage
    public void onMessage(Session session, String message){
        System.out.println(message);

        try{
            session.getBasicRemote().sendText(message);
        }
        catch (IOException e)
        {
            System.out.println("you fucked up bad dude");
        }
        
    }


}
