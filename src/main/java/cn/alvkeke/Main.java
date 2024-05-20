package cn.alvkeke;

import cn.alvkeke.handler.CategoryHandler;
import cn.alvkeke.handler.NotFoundHandler;
import cn.alvkeke.handler.NoteHandler;
import cn.alvkeke.handler.ResourceHandler;
import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;


public class Main {

    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(9000), 0);

        server.createContext("/", new ResourceHandler());
        server.createContext("/note/", new NoteHandler());
        server.createContext("/category/", new CategoryHandler());

        server.createContext("/note", new NotFoundHandler());
        server.createContext("/category", new NotFoundHandler());
        server.setExecutor(null);

        server.start();
    }

}
