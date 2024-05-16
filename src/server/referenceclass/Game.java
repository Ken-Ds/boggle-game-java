package server.referenceclass;

import server.model.ParseDatabase;

import java.util.*;

public class Game {
    private int round;
    private static int waitingTime;
    private static int roundTime;
    private Hashtable<String,Integer> roundScores = new Hashtable<>();
    private ArrayList<Player> players = new ArrayList<>();
    private Hashtable<String,Integer> gameScores = new Hashtable<>();
    private ArrayList<Character> letters;
    private Hashtable<String, Integer> overAllScore = new Hashtable<>();
    private Player gameWinner = new Player(-1,"none");

    private Boolean stat;

    public Game(Player player, int waitingTime, int roundTime) {
        round = 0;
        this.waitingTime = waitingTime;
        this.roundTime = roundTime;
        players.add(player);
        gameScores.put(player.getUsername(), 0);
        roundScores.put(player.getUsername(),0);
        overAllScore.put(player.getUsername(),0);
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
        for (Player player: players){
            setOverAllScore(player);
        }

        int highestScore = 0;
        String user = null;
        boolean tie = false;

        for (int y = 0; y < players.size() - 1; y++) {
            String username = players.get(y).getUsername();
            int playerScore = roundScores.get(username);
            String username1 = players.get(y + 1).getUsername();
            int playerScore1 = roundScores.get(username1);

            if (playerScore > playerScore1) {
                if (playerScore > highestScore) {
                    highestScore = playerScore;
                    user = username;
                    tie = false;
                } else if (playerScore == highestScore) {
                    tie = true;
                }
            } else if (playerScore < playerScore1) {
                if (playerScore1 > highestScore) {
                    highestScore = playerScore1;
                    user = username1;
                    tie = false;
                } else if (playerScore1 == highestScore) {
                    tie = true;
                }
            }
        }

        if (!tie && user != null) {
            setGameScore(user);
        }

        if(thereIsWinner()) {
            gameEnd();
        } else {
            round++;
            letters = setLetters();
            for (int x = 0; x < players.size(); x++) {
                roundScores.put(players.get(x).getUsername(), 0);
            }
        }
    }

    public void addPlayer(Player player){
        players.add(player);
        gameScores.put(player.getUsername(),0);
        roundScores.put(player.getUsername(),0);
        overAllScore.put(player.getUsername(),0);
    }
    public void setPlayerScore(Player player, int score){
        roundScores.put(player.getUsername(),score);
    }

    public ArrayList<Integer> getRoundScores(){
        ArrayList<Integer> roundScores = new ArrayList<>();
        for (Player player : players){
            roundScores.add(this.roundScores.get(player.getUsername()));
        }
        return roundScores;
    }

    public int getPlayerRoundScore(Player player){
        return roundScores.get(player.getUsername());
    }


    public void setGameScore(String username){
        int score = gameScores.get(username)+1;
        gameScores.put(username,score);
    }

    public ArrayList<Integer> getGameScores(){
        ArrayList<Integer> gameScores = new ArrayList<>();
        for (Player player : players){
            gameScores.add(this.gameScores.get(player.getUsername()));
        }
        return gameScores;
    }

    public int getPLayerGameScore(Player player){
        return gameScores.get(player.getUsername());
    }

    public ArrayList<Player> getPlayers(){
        return players;
    }

    public void removePlayer(Player player){
        int index = getPLayerIndex(player);
        if (index != -1){
            players.remove(index);
        }
    }

    public int getPLayerIndex(Player player){
        for (int x = 0; x <= players.size()-1; x++){
            if (player.getId() == players.get(x).getId())
                return x;
        }
        return -1;
    }

    public ArrayList<Character> getLetters(){
        return letters;
    }



    public static ArrayList<Character> setLetters() {
        ArrayList<Character> characters = new ArrayList<>();
        Random random = new Random();


        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        char[] consonants = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};

        // Add 7 vowels
        for (int i = 0; i < 7; i++) {
            characters.add(vowels[random.nextInt(vowels.length)]);
        }
        for (int i = 0; i < 13; i++) {
            characters.add(consonants[random.nextInt(consonants.length)]);
        }

        Collections.shuffle(characters);

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

    public boolean thereIsWinner(){
        for (Player player: players){
            if(gameScores.get(player.getUsername()) == 3){
                gameWinner = player;
                int score = overAllScore.get(player.getUsername());
                ParseDatabase parseDatabase = new ParseDatabase();
                parseDatabase.setConnection();
                parseDatabase.setHighScore(player.getId(),score);
                return true;
            }
        }
        return false;
    }

    public Player gameWinner(){
        return gameWinner;
    }

    public int getGameWinnerScore(String username){
        return overAllScore.get(username);
    }

    public void setOverAllScore(Player player){
        int roundScore = roundScores.get(player.getUsername());
        int overAScore = (overAllScore.get(player.getUsername())) + roundScore;
        overAllScore.put(player.getUsername(),overAScore);
    }

    public ArrayList<Integer> getOverAllScores(){
        ArrayList<Integer> overAllScores = new ArrayList<>();
        for (Player player : players){
            overAllScores.add(overAllScore.get(player.getUsername()));
        }
        return overAllScores;
    }
}