package cn.alvkeke.handler;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

public class NotFoundHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        System.out.println("404 handler");
        exchange.sendResponseHeaders(404, 0);
        exchange.close();
    }
}
