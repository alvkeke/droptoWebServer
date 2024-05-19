package cn.alvkeke;

import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;


public class Main {




    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(9000), 0);
        server.createContext("/note/", new NoteHandler());
        server.createContext("/category/", new CategoryHandler());
        server.setExecutor(null);
        server.start();
    }

}
