package server.referenceclass;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Game {
    private int gameID;
    private int round;
    private static int waitingTime;
    private static int roundTime;
    private ArrayList<Integer> roundScores = new ArrayList<>();
    private ArrayList<Player> players = new ArrayList<>();
    private ArrayList<Integer> gameScores = new ArrayList<>();
    private ArrayList<Character> letters;
    private Boolean stat;

    public Game( Player player, int waitingTime, int roundTime) {
        round = 1;
        this.waitingTime = waitingTime;
        this.roundTime = roundTime;
        players.add(player);
        gameScores.add(0);
        roundScores.add(0);
        stat = false;
        letters = setLetters();
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

    public Boolean getStat(){
        return stat;
    }

    public void gameStart(){
        stat = true;
    }
    public void gameEnd(){
        stat = false;
    }

    public void startWaitTimer() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int countdown = waitingTime;
            @Override
            public void run() {
                if (countdown > 0) {
                    System.out.println("Time remaining: " + countdown + " seconds");
                    countdown--;
                    waitingTime = countdown;
                } else {
                    System.out.println("Game Started!");
                    gameStart();
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 1000, 1000);
    }

    public void startRoundTimer() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int countdown = roundTime;
            @Override
            public void run() {
                if (countdown > 0) {
                    System.out.println("Time remaining: " + countdown + " seconds");
                    countdown--;
                    roundTime = countdown;
                } else {
                    System.out.println("Game Started!");
                    gameStart();
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 1000, 1000);
    }
}
