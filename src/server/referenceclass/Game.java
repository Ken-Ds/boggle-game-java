package server.referenceclass;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    int gameID;
    int round;
    int waitingTime;
    int roundTime;
    ArrayList<Integer> roundScores = new ArrayList<>();
    ArrayList<Player> players = new ArrayList<>();
    ArrayList<Integer> gameScores = new ArrayList<>();
    ArrayList<Character> letters = setLetters();

    public Game(int gameID, int waitingTime, int roundTime, Player player) {
        this.gameID = gameID;
        round = 1;
        this.waitingTime = waitingTime;
        this.roundTime = roundTime;
        players.add(player);
        gameScores.add(0);
        roundScores.add(0);
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public int getRound() {
        return round;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    public int getRoundTime() {
        return roundTime;
    }

    public void setRoundTime(int roundTime) {
        this.roundTime = roundTime;
    }

    public void nextRound(){
        round++;
        letters = setLetters();
        for (int x = 0; x < gameScores.size()-1; x++){
            gameScores.set(x,0);
        }
    }

    public void addPlayer(Player player){
        players.add(player);
        gameScores.add(0);
    }
    public void setPlayerScore(Player player, int score){
        int playerLoc = 0;
        for (int x = 0; x < players.size() -1; x++){
            if(player.getId() == players.get(x).getId()){
                playerLoc = x;
            }
        }
        roundScores.set(playerLoc,score);
    }

    public void setGameScore(int id){
        int playerLoc = 0;
        for (int x = 0; x < players.size()-1; x++){
            if (id == players.get(x).getId()){
                playerLoc = x;
            }
        }
        int score = gameScores.get(playerLoc) + 1;
        gameScores.set(playerLoc,score);
    }

    public ArrayList<Player> getPlayers(){
        return players;
    }

    public ArrayList<Character> getLetters(){
        return letters;
    }

    public ArrayList<Character> setLetters(){
        ArrayList<Character> characters = new ArrayList<>();
        Random random = new Random();
        for (int x = 0; x < 20; x++){
            characters.add((char) (random.nextInt(26)+'A'));
        }
        return characters;
    }
}
