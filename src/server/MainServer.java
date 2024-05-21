package server;

import server.model.Server;
import server.model.SetJTable;
import server.view.mainComponents.ServerMain;
import server.view.serverPanels.ManageUsersPanel;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class MainServer{

    private static Server server = new Server();
    public static ServerMain serverMain = new ServerMain();

    public static void main(String[] args) {
        serverMain.setVisible(true);
        server.startServer(args);
    }
}
