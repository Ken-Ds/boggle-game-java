package server.model;

import server.referenceclass.Player;

import java.sql.*;
import java.util.ArrayList;

public class ParseDatabase {
    private static Connection connection;

    public static void setConnection() {
        try {
            connection = DriverManager.getConnection("jdbc://localhost:3306/boggle?user=root&password");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Player> getUsers(){
        ArrayList<Player> players = new ArrayList<>();
        try {
            String query = "SELECT * FROM USERS";
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                Player player = new Player(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3), resultSet.getInt(4));
                players.add(player);
            }
            resultSet.close();
            return players;
        } catch (Exception e){
            e.printStackTrace();
        }
        return players;
    }

    public int getScore(String word){
        int score = 0;
        try {
            String query = "SELECT score FROM WORDS WHERE ";
        }catch (Exception e){
            e.printStackTrace();
        }
        return score;
    }
}
