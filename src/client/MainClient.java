package client;

import client.model.Connect;

public class MainClient {
    static Connect connect = new Connect();
    public static void main(String[] args) {
        connect.createConnection(args);
    }
}
