package cn.alvkeke;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class CategoryHandler implements HttpHandler {


    @Override
    public void handle(HttpExchange exchange) throws IOException {


        String response = "This is the response for category";
        exchange.sendResponseHeaders(200, response.length());
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
