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
    private Map<String, Player> players;
    private List<Player> currentGame;
    private static int waitingTime;
    private static int roundTime;
    private static int gameId = 0;
    public static ArrayList<Player> playersLoggedIn = new ArrayList<>();

    public static Hashtable<Integer,Game> games = new Hashtable<>();


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
        System.out.println("Server Running");
    }

    public static void playGame(Player player){
        if (games.isEmpty())
            games.put(gameId, (new Game(player, waitingTime,roundTime)));
        else {
            gameId = games.size();
            games.put(gameId, new Game(player, waitingTime, roundTime));
        }
        games.get(gameId).startWaitTimer();
    }

    public static void joinGame(Player player){
        for (int x = 0; x <= games.size()-1; x++){
            if (games.get(x).getStat() == false){
                games.get(x).addPlayer(player);
            }
        }
    }

    public static void startGame(Player player){

    }

    public static void setWaitingTime(int waitingTime){
        Server.waitingTime = waitingTime;
    }

    public static void setRoundTime(int roundTime){
        Server.roundTime = roundTime;
    }

    public static int checkPlayerGame(Player player){
        System.out.println("Number of games: " + games.size());
        for (int x = 0; x <= games.size()-1; x++){
            System.out.println(games.get(x).getPlayers());
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

    /*public static void startTimer(int seconds, int gameId) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int countdown = seconds;
            @Override
            public void run() {
                if (countdown > 0) {
                    System.out.println("Time remaining: " + countdown + " seconds");
                    countdown--;
                } else {
                    System.out.println("Game Started!");
                    games.get(gameId).gameStart();
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 1000, 1000);
    }*/
}
