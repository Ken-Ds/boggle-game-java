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
    public String[] getLeaderBoardsNames() {
        ArrayList<Player> players = parseDatabase.getLeaderBoards();
        String[] names = new String[players.size()];
        for (int x = 0; x < players.size(); x++){
            names[x] = players.get(x).getUsername();
        }
        return names;
    }

    @Override
    public int[] getLeaderBoardsScores() {
        ArrayList<Player> players = parseDatabase.getLeaderBoards();
        int[] scores = new int[players.size()];
        for (int x = 0; x < players.size(); x++){
            scores[x] = players.get(x).getHighScore();
        }
        return scores;
    }

    @Override
    public void startGame(String username) {
        Player player = parseDatabase.getPlayerInfo(username);
        if(Server.waitingGameExist()) {
            Server.joinGame(player);
            System.out.println(player.getUsername() + " has joined Game " + Server.checkPlayerGame(player));
        }
        else {
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
    public void submitWord(String word, String username) {
        Boolean isUnique = true;
        word = word.toLowerCase();
        Player player = parseDatabase.getPlayerInfo(username);
        if (parseDatabase.isValidWord(word)) {
            System.out.println("Valid Word");
            int gameId = Server.checkPlayerGame(player);
            ArrayList<Player> players = Server.games.get(gameId).getPlayers();
            for (int x = 0; x <= players.size()-1; x++){
                Player player1 = players.get(x);
                ArrayList<String> player1Words = Server.playerWords.get(player1.getUsername());
                for (int y = 0; y <= player1Words.size()-1; y++){
                    if (word.equals(player1Words.get(y))){
                        player1Words.remove(y);
                        isUnique = false;
                    }
                    Server.playerWords.put(player1.getUsername(),player1Words);
                }
            }
            if (isUnique){
                ArrayList<String> playerWords = Server.playerWords.get(username);
                playerWords.add(word);
                Server.playerWords.put(username,playerWords);
            }
        }
    }

    @Override
    public String[] getGamePlayers(String username) {
        Player player = parseDatabase.getPlayerInfo(username);
        int game = Server.checkPlayerGame(player);
        ArrayList<Player> players = Server.games.get(game).getPlayers();
        String[] names = new String[players.size()];
        for (int x = 0; x < players.size(); x++){
            names[x] = players.get(x).getUsername();
        }
        return names;
    }

    @Override
    public int[] getRoundScores(String username) {
        Player player =parseDatabase.getPlayerInfo(username);
        int game = Server.checkPlayerGame(player);
        ArrayList<Integer> roundScores = Server.games.get(game).getRoundScores();
        int[] scores = new int[roundScores.size()];
        for (int x = 0; x < roundScores.size(); x++){
            scores[x] = roundScores.get(x);
        }
        return scores;
    }

    @Override
    public int[] getGameScores(String username) {
        Player player =parseDatabase.getPlayerInfo(username);
        int game = Server.checkPlayerGame(player);
        ArrayList<Integer> gameScores = Server.games.get(game).getGameScores();
        int[] scores = new int[gameScores.size()];
        for (int x = 0; x < gameScores.size(); x++){
            scores[x] = gameScores.get(x);
        }
        return scores;
    }

    @Override
    public int[] getOverAllScores(String username) {
        Player player =parseDatabase.getPlayerInfo(username);
        int game = Server.checkPlayerGame(player);
        ArrayList<Integer> overAllScores = Server.games.get(game).getOverAllScores();
        int[] scores = new int[overAllScores.size()];
        for (int x = 0; x < overAllScores.size(); x++){
            scores[x] = overAllScores.get(x);
        }
        return scores;
    }


    @Override
    public String getRoundWinner(String username) {
        Player player = parseDatabase.getPlayerInfo(username);
        int game = Server.checkPlayerGame(player);
        return Server.games.get(game).gameWinner().getUsername();
    }

    @Override
    public boolean gameStatus(String username) {
        Player player = parseDatabase.getPlayerInfo(username);
        int game = Server.checkPlayerGame(player);
        return Server.games.get(game).getStat();
    }

    @Override
    public void logOut(String username) {
        for (int x = 0; x < Server.playersLoggedIn.size(); x++){
            if (username.equals(Server.playersLoggedIn.get(x).getUsername())){
                Server.playersLoggedIn.remove(x);
            }
        }
    }

    @Override
    public String getGameWinner(String username) {
        Player player = parseDatabase.getPlayerInfo(username);
        int game = Server.checkPlayerGame(player);
        return Server.games.get(game).gameWinner().getUsername();
    }

    @Override
    public int getGameWinnerOverAllScore(String username) {
        Player player = parseDatabase.getPlayerInfo(username);
        int game = Server.checkPlayerGame(player);
        return Server.games.get(game).getGameWinnerScore(getGameWinner(username));
    }

    @Override
    public boolean thereIsWinner(String username) {
        return false;
    }
}
