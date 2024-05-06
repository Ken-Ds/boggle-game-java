package server.Controller;

import Boggle.Player;
import org.omg.CORBA.ORB;

import java.util.*;

public class Server{

    private ORB orb;
    private Map<String, Player> players;
    private List<Player> currentGame;
    private int waitingTime;
    private int roundDuration;
    private Set<String> usedWords;

    public void startServer(){
        orb = orb.init();
        players = new HashMap<>();
        currentGame = new ArrayList<>();
    }

    public void startGame(String username){
        Player player = players.get(username);
        if(currentGame.size() < 2){
            currentGame.add(player);
            if(currentGame.size() == 2){
                start
            }
        }
    }
}
