package server.model;

import Boggle.AlreadyLoggedIn;
import Boggle.ClientInterfacePOA;
import Boggle.IsNotUser;
import server.referenceclass.Player;

public class ClientInterfaceImplementation extends ClientInterfacePOA {

    ParseDatabase parseDatabase = new ParseDatabase();

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
        Server.playersLoggedIn.add(parseDatabase.getPlayerInfo(username));
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
