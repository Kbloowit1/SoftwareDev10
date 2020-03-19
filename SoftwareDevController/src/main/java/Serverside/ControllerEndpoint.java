package Serverside;


import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/contoller")
public class ControllerEndpoint {

    private Session session;


    @OnOpen
    public void onOpen(){

    }
}
