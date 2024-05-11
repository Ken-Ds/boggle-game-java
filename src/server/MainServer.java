package server;

import server.model.Server;

public class MainServer{

    private static Server server = new Server();

    public static void main(String[] args) {
        server.startServer(args);
    }
}
