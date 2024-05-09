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
            String query = "SELECT * FROM accounts";
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

    public int getHighScore(String word){
        int score = 0;
        try {
            String query = "SELECT score FROM WORDS WHERE (word = ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, word);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                score = resultSet.getInt(1);
            }
            resultSet.close();
            return score;
        }catch (Exception e){
            e.printStackTrace();
        }
        return score;
    }

    public ArrayList<Integer> getLeaderBoards(){
        ArrayList<Integer> topFive = new ArrayList<>();
        try {
            String query ="SELECT highscore FROM accounts ORDER BY highscore DESC LIMIT 5";
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                int score = resultSet.getInt(1);
                topFive.add(score);
            }
            resultSet.close();
            return topFive;
        } catch (Exception e){
            e.printStackTrace();
        }
        return topFive;
    }
}
