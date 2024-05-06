package server.model;

import Boggle.ClientInterfacePOA;

public class ClientInterfaceImplementation extends ClientInterfacePOA {
    @Override
    public void logIn(String username, String getPassword) {

    }

    @Override
    public boolean isLoggedIn() {
        return false;
    }

    @Override
    public void startGame() {

    }

    @Override
    public int submitWord(String submitWord) {
        return 0;
    }

    @Override
    public int getScore() {
        return 0;
    }
}
