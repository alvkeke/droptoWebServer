package cn.alvkeke;

import cn.alvkeke.handler.CategoryHandler;
import cn.alvkeke.handler.NoteHandler;
import cn.alvkeke.handler.ResourceHandler;
import cn.alvkeke.storage.DatabaseHelper;
import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;


public class Main {

    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(9000), 0);

        server.createContext("/", new ResourceHandler());
        server.createContext(NoteHandler.path, new NoteHandler());
        server.createContext(CategoryHandler.path, new CategoryHandler());

        server.setExecutor(null);

        DatabaseHelper.createDatabase();

        server.start();
    }

}
