package server;

import server.controller.Server;

public class MainServer{
    static Server server = new Server();
    public static void main(String[] args) {
        server.startServer(args);
    }
}
