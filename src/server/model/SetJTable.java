package server.model;

import server.referenceclass.Player;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class SetJTable {
    private ParseDatabase parseDatabase = new ParseDatabase();

    public DefaultTableModel setUsersTable(){
        parseDatabase.setConnection();
        ArrayList<Player> players = parseDatabase.getUsers();

        String[] columnNames = {"ID", "Username", "Password", "High Score"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };

        for (Player player: players){
            String id = String.valueOf(player.getId());
            String username = player.getUsername();
            String password = player.getPassword();
            String highScore = String.valueOf(player.getHighScore());
            model.addRow(new Object[]{id, username,password,highScore});
        }
        return model;
    }

    public DefaultTableModel searchTable(String username){
        parseDatabase.setConnection();
        String[] columnNames = {"ID", "Username", "Password", "High Score"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        Player player = parseDatabase.getPlayerInfo(username);
        try {
            model.addRow(new Object[]{player.getId(),player.getUsername(),player.getPassword(),player.getHighScore()});
        } catch (NullPointerException e){
            return model;
        }
        return model;
    }
}
