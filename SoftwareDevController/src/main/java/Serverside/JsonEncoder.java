package Serverside;

import com.google.gson.Gson;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

public class JsonEncoder implements Encoder.Text<Stoplichten> {

    private static Gson gson = new Gson();

    @Override
    public String encode(Stoplichten stoplichten) {
        return gson.toJson(stoplichten);
    }

    @Override
    public void init(EndpointConfig endpointConfig) {

    }

    @Override
    public void destroy() {

    }
}
