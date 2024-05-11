package server.model;

import server.referenceclass.Game;
import server.referenceclass.Player;

import java.util.ArrayList;

public class GameMethods {
    ArrayList<Game> games = new ArrayList<>();
    ArrayList<Boolean> started = new ArrayList<>();
    int gameId = 0;

    public void startGame(Player player, int waitingTime, int roundTime){
        if (games.isEmpty())
            games.add(new Game(gameId, waitingTime,roundTime, player));
        else
            games.add(new Game(games.size(), waitingTime, roundTime, player));
        started.add(false);
    }

    public void joinGame(Player player){
        for (int x = 0; x < games.size()-1; x++){
            if (!started.get(x)){
                games.get(x).addPlayer(player);
            }
        }
    }

    public int checkPlayerGame(Player player){
        for (int x = 0; x < games.size()-1; x++){
            for (int y = 0; x < games.get(x).getPlayers().size()-1; y++){
                if (player.getId() == games.get(x).getPlayers().get(y).getId()){
                    return games.get(x).getGameID();
                }
            }
        }
        return -1;
    }


}
