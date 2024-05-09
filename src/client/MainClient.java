package client;

import client.model.Connect;
import client.view.Menu.LogIn;

public class MainClient {
    static Connect connect = new Connect();

    public static void main(String[] args) {
        connect.createConnection(args);
        new LogIn().setVisible(true);
    }
}
