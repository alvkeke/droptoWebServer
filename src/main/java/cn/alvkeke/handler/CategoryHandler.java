package cn.alvkeke.handler;

import cn.alvkeke.Config;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class CategoryHandler implements HttpHandler {


    public static final String handlerName = "category";
    public static final String path = Config.getApiPath(handlerName);

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        System.out.println("category handler");

        String response = "This is the response for category";
        exchange.sendResponseHeaders(200, response.length());
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
