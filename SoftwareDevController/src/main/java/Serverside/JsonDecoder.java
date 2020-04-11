package Serverside;

import Controller.Verkeer;
import com.google.gson.Gson;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

public class JsonDecoder implements Decoder.Text<Verkeer> {

    Gson gson = new Gson();

    @Override
    public Verkeer decode(String s) throws DecodeException {
        return gson.fromJson(s, Verkeer.class);
    }

    @Override
    public boolean willDecode(String s) {
        return (s != null);
    }

    @Override
    public void init(EndpointConfig endpointConfig) {

    }

    @Override
    public void destroy() {

    }
}
