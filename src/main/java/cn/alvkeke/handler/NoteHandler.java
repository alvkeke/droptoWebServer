package cn.alvkeke.handler;

import cn.alvkeke.Config;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class NoteHandler implements HttpHandler {

    public static final String handlerName = "note";
    public static final String path = Config.getApiPath(handlerName);

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        System.out.println("note handler");

        String response = "This is the response for note";
        exchange.sendResponseHeaders(200, response.length());
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }


}
