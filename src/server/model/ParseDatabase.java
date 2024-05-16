package server.model;

import Boggle.IsNotUser;
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

    public void validateIfUser(String username, String password) throws IsNotUser{
        ArrayList<Player> players = getUsers();
        for (Player player : players){
            if(player.getUsername().equals(username) && player.getPassword().equals(password)){
                return;
            }
        }
        throw new IsNotUser();
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

    public int getWordScore(String word){
        int score = 0;
        try {
            String query = "SELECT score FROM WORDS WHERE word = ?";
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

    public ArrayList<Player> getLeaderBoards(){
        ArrayList<Player> topFive = new ArrayList<>();
        try {
            String query ="SELECT * FROM accounts ORDER BY highscore DESC LIMIT 5";
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                topFive.add(new Player(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getInt(4)));
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

    public Player getPlayerInfo(String username){
        Player player = null;
        try {
            String query = "SELECT id, username, password, highscore FROM accounts WHERE username=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,username);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                player = new Player(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getInt(4));
            }
            resultSet.close();
        }catch (Exception e){
            System.out.println("Unable to Fetch Player Info");
        }
        return player;
    }

    public void setHighScore(int id, int newHighScore){
        int highScore = 0;
        try {
            System.out.println(id + " " + newHighScore);
            String query = "SELECT highscore FROM accounts WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                highScore = resultSet.getInt(1);
            }
            resultSet.close();

            if (highScore < newHighScore) {
                String query2 = "UPDATE accounts SET highscore=? WHERE id=?";
                PreparedStatement preparedStatement2 = connection.prepareStatement(query2);
                preparedStatement2.setInt(2, id);
                preparedStatement2.setInt(1, newHighScore);
                preparedStatement2.execute();
            }
            System.out.println("HighScore Changed");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public boolean isValidWord(String word){
        System.out.println(word);
        try{
            String query = "SELECT word FROM WORDS WHERE word = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,word);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                if(word.equals(resultSet.getString(1))) {
                    System.out.println("True");
                    return true;
                }

            }
            System.out.println("false");
            return false;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public boolean checkDuplicateUsername(String username) {
        try {

            // Create a PreparedStatement to execute the query
            PreparedStatement pst = connection.prepareStatement("SELECT * FROM accounts WHERE username = ?");
            pst.setString(1, username);

            // Execute the query
            ResultSet rs = pst.executeQuery();

            // If any result is returned, the username already exists
            if (rs.next()) {
                return true;
            }

            // Close the connections
            rs.close();
            pst.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

}
