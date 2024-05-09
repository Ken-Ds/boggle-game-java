package server;

import client.view.MainView;
import server.controller.Server;
import server.model.Methods;
import server.view.mainComponents.ServerMain;

public class MainServer{

    private static Server server = new Server();

    public static void main(String[] args) {
        server.startServer(args);
    }
}
