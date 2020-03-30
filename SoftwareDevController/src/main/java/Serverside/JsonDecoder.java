package Serverside;

import com.google.gson.Gson;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

public class JsonDecoder implements Decoder.Text<Stoplichten> {

    Gson gson = new Gson();

    @Override
    public Stoplichten decode(String s) throws DecodeException {
        return gson.fromJson(s, Stoplichten.class);
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
