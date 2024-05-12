package server.model;

import Boggle.AlreadyLoggedIn;
import Boggle.ClientInterfacePOA;
import Boggle.IsNotUser;
import server.referenceclass.Player;

import java.util.ArrayList;

public class ClientInterfaceImplementation extends ClientInterfacePOA {

    private static ParseDatabase parseDatabase = new ParseDatabase();

    @Override
    public int[] getLeaderBoards() {
        return new int[0];
    }

    @Override
    public void logIn(String username, String password) throws AlreadyLoggedIn, IsNotUser {
        parseDatabase.setConnection();
        parseDatabase.validateIfUser(username,password);
        for (Player player : Server.playersLoggedIn){
            System.out.print(player.getUsername());
            if(username.equals(player.getUsername())){
                throw new AlreadyLoggedIn("Account is Already LoggedIn");
            }
        }
        Player player = parseDatabase.getPlayerInfo(username);
        Server.playersLoggedIn.add(player);
    }

    @Override
    public void startGame(String username) {
        Player player = parseDatabase.getPlayerInfo(username);
        if(Server.waitingGameExist()) {
            Server.joinGame(player);
            System.out.println(player.getUsername() + " has joined Game " + Server.checkPlayerGame(player));
        }
        else {
            Server.setWaitingTime(10);
            Server.setRoundTime(10);
            Server.playGame(player);
            System.out.println(player.getUsername() + " has started Game " + Server.checkPlayerGame(player));
        }
    }

    @Override
    public int getRoundTime(String username) {
        Player player = parseDatabase.getPlayerInfo(username);
        int game = Server.checkPlayerGame(player);
        return Server.games.get(game).getRoundTime();
    }

    @Override
    public int getWaitingTime(String username) {
        Player player = parseDatabase.getPlayerInfo(username);
        int game = Server.checkPlayerGame(player);
        return Server.games.get(game).getWaitingTime();
    }

    @Override
    public char[] getLetters(String username) {
        Player player = parseDatabase.getPlayerInfo(username);
        int game = Server.checkPlayerGame(player);
        ArrayList<Character> lets = Server.games.get(game).getLetters();
        char[] letters = new char[lets.size()];
        for (int i = 0; i < lets.size(); i++) {
            letters[i] = lets.get(i);
        }
        return letters;
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
