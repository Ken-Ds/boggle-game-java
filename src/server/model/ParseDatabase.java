package server.model;

import server.referenceclass.Player;

import java.sql.*;
import java.util.ArrayList;

public class ParseDatabase {
    private static Connection connection;

    public  void setConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/boggle?user=root&password");
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

    public void addUser(String username, String password){
        try {
            String query = "INSERT INTO accounts(username, password) VALUES(?,?)";
            PreparedStatement preparedStatement =  connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2,password);
            preparedStatement.execute();
            System.out.println("User Added");
        }catch (Exception e){
            System.out.println("Failed to Add User");
        }
    }

    public void deleteUser(int id){
        try{
            String query = "DELETE FROM accounts WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            preparedStatement.execute();
            System.out.println("User Deleted");
        }catch (Exception e){
            System.out.println("Failed to Delete User");
        }
    }

    public void editUser(int id, String newUserName, String newPassword){
        try{
            String query = "UPDATE accounts SET username=?, password=? WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(3,id);
            preparedStatement.setString(1,newUserName);
            preparedStatement.setString(2, newPassword);
            preparedStatement.execute();
            System.out.println("Account has been Edited");
        }catch (Exception e){
            System.out.println("Account Not Edited");
        }
    }
}
