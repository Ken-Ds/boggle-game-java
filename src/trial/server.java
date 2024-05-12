package trial;

import server.model.Server;

public class server {
    private static Server server = new Server();
    public static void main(String[] args) {
        server.startServer(args);
    }
}
