package server;

import server.model.Server;
import server.view.mainComponents.ServerMain;

public class MainServer{

    private static Server server = new Server();
    public static ServerMain serverMain = new ServerMain();

    public static void main(String[] args) {
        serverMain.setVisible(true);
        server.startServer(args);
    }
}
