package server;

import server.controller.Server;
import server.model.Methods;

public class MainServer{

    private static Server server = new Server();

    public static void main(String[] args) {
        server.startServer(args);
    }
}
