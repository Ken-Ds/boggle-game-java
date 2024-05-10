package server.model;

import Boggle.AlreadyLoggedIn;
import Boggle.ClientInterfacePOA;
import Boggle.IsNotUser;
import server.controller.Server;

public class ClientInterfaceImplementation extends ClientInterfacePOA {

    @Override
    public int[] getLeaderBoards() {
        return new int[0];
    }

    @Override
    public void logIn(String username, String getPassword) throws AlreadyLoggedIn, IsNotUser {

    }

    @Override
    public void startGame(String username) {

    }

    @Override
    public int getRoundTime(String username) {
        return 0;
    }

    @Override
    public int getWaitingTime(String username) {
        return 0;
    }

    @Override
    public char[] getLetters(String username) {
        return new char[0];
    }

    @Override
    public int submitWord(String word, String username) {
        return 0;
    }

    @Override
    public int getScore(String username) {
        return 0;
    }

    @Override
    public String getRoundWinner(String username) {
        return null;
    }
}
