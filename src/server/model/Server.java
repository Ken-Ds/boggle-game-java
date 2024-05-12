package server.model;


import Boggle.ClientInterface;
import Boggle.ClientInterfaceHelper;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import server.referenceclass.Game;
import server.referenceclass.Player;

import java.util.*;

public class Server{
    private ORB orb;
    private List<Player> currentGame;
    private static int waitingTime;
    private static int roundTime;
    private static int gameId = 0;
    public static ArrayList<Player> playersLoggedIn = new ArrayList<>();

    public static Hashtable<Integer,Game> games = new Hashtable<>();

    public static Hashtable<String,ArrayList<String>> playerWords = new Hashtable<>();

    ParseDatabase parseDatabase = new ParseDatabase();

    public void startServer(String args[]){
        orb = ORB.init(args,null);
        try {
            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootPOA.the_POAManager().activate();

            ClientInterfaceImplementation clientInterfaceImplementation = new ClientInterfaceImplementation();

            org.omg.CORBA.Object ref = rootPOA.servant_to_reference(clientInterfaceImplementation);
            ClientInterface cRef = ClientInterfaceHelper.narrow(ref);

            org.omg.CORBA.Object objectRef = orb.resolve_initial_references("NameService");

            NamingContextExt ncRef = NamingContextExtHelper.narrow(objectRef);

            String name = "Boggle";
            NameComponent path[] = ncRef.to_name(name);

            ncRef.rebind(path,cRef);

            System.out.println("Server is Running...");
            orb.run();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void playGame(Player player){
        if (games.isEmpty())
            games.put(gameId, (new Game(player, waitingTime,roundTime)));
        else {
            gameId = games.size();
            games.put(gameId, new Game(player, waitingTime, roundTime));
        }
        startWaitTimer(gameId);
    }

    public static void joinGame(Player player){
        for (int x = 0; x <= games.size()-1; x++){
            if (games.get(x).getStat() == false){
                games.get(x).addPlayer(player);
            }
        }
    }

    public static void startGame(int gameId){
        games.get(gameId).gameStart();
        for (Player player : games.get(gameId).getPlayers()) {
            playerWords.put(player.getUsername(), new ArrayList<>());
        }
        startRoundTimer(gameId);
    }

    public static void setWaitingTime(int waitingTime){
        Server.waitingTime = waitingTime;
    }

    public static void setRoundTime(int roundTime){
        Server.roundTime = roundTime;
    }

    public static int checkPlayerGame(Player player){
        for (int x = 0; x <= games.size()-1; x++){
            for (int y = 0; y <= games.get(x).getPlayers().size()-1; y++){
                if (player.getId() == games.get(x).getPlayers().get(y).getId()){
                    return x;
                }
            }
        }
        return -1;
    }

    public static Boolean waitingGameExist(){
        for (int x = 0; x <= games.size()-1;x++){
            if (!games.get(x).getStat()){
                System.out.println("Game Available");
                return true;
            }
        }
        System.out.println("Games Unavailable");
        return false;
    }

    public static void startWaitTimer(int gameId) {
        int temp = games.get(gameId).getWaitingTime();
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int countdown = temp;
            @Override
            public void run() {
                if (countdown > 0) {
                    System.out.println("Time remaining: " + countdown + " seconds");
                    countdown--;
                    games.get(gameId).setWaitingTime(countdown);
                } else {
                    if(games.get(gameId).getPlayers().size() > 1 && !games.get(gameId).thereIsWinner()){
                        System.out.println("Game Started!");
                        games.get(gameId).gameStart();
                        games.get(gameId).nextRound();
                        waitingTime = temp;
                        startGame(gameId);
                    } else {
                        games.get(gameId).gameEnd();
                        if (games.get(gameId).gameWinner() != null){
                            System.out.println(games.get(gameId).gameWinner()+ "won the game");

                        } else {
                            System.out.println("Game Not Started");
                        }
                        removeGameAfter1(gameId);
                    }
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 1000, 1000);
    }

    public static void startRoundTimer(int gameId) {
        int temp = games.get(gameId).getRoundTime();
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int countdown = temp;
            @Override
            public void run() {
                if (countdown > 0) {
                    System.out.println("Time remaining: " + countdown + " seconds");
                    countdown--;
                    games.get(gameId).setRoundTime(countdown);
                } else {
                    System.out.println("Round Ended!");
                    System.out.println(playerWords);
                    setGameRoundScore(gameId);
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 1000, 1000);
    }

    public static void removeGameAfter1(int gameId){
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int countdown = 1;
            @Override
            public void run() {
                if (countdown > 0) {
                    countdown--;
                } else {
                    games.remove(gameId);
                }
            }
        };
        timer.scheduleAtFixedRate(task, 1000, 1000);
    }

    public static void setGameRoundScore(int gameId){
        ParseDatabase parseDatabase = new ParseDatabase();
        for (Player player :games.get(gameId).getPlayers()) {
            ArrayList<String> words = Server.playerWords.get(player.getUsername());
            int score = 0;
            if (words != null) {
                for (String word : words) {
                    score = score + parseDatabase.getWordScore(word);
                }
                games.get(gameId).setPlayerScore(player,score);
            }
        };
    }
}
