package client.model;

import Boggle.AlreadyLoggedIn;
import Boggle.IsNotUser;

public class GameLogic {
    public static void login(String username, String password, Connect connect) throws AlreadyLoggedIn, IsNotUser {
        connect.clientInterfaceImplementation.logIn(username,password);
    }
    public static void start(User user, Connect connect)  {
        connect.clientInterfaceImplementation.startGame(user.getUsername());
    }


}
