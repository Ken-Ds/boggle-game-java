package server;

import server.model.Server;
import server.view.mainComponents.ServerMain;
import server.view.serverPanels.ManageUsersPanel;

import java.awt.*;

public class MainServer{

    private static Server server = new Server();

    public static void main(String[] args) {
        ServerMain serverMain = new ServerMain();
        serverMain.setVisible(true);
        server.startServer(args);
    }
}
