package trial;

import server.referenceclass.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Timer;
import java.util.TimerTask;

public class Trial{
    public static void main(String[] args) {
        // Dummy data for testing
        String[] highNames = {"Kendick", "John", "Alice", "Bob", "Emma"};
        int[] highScores = {-9, -8, -7, -6, -5};

        // Create the frame
        JFrame frame = new JFrame("Leaderboard Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);

        // Create the main leaderboard panel
        JPanel panelScrollLeaderB = new JPanel();
        panelScrollLeaderB.setBackground(new Color(45, 81, 40));
        panelScrollLeaderB.setLayout(new BoxLayout(panelScrollLeaderB, BoxLayout.Y_AXIS));

        // Create and add player panels to the leaderboard panel
        for (int x = 0; x < highNames.length; x++) {
            JPanel playerPanel = new JPanel();
            playerPanel.setLayout(new GridLayout(1, 2));
            playerPanel.setBackground(new Color(45, 81, 40));
            playerPanel.setPreferredSize(new Dimension(220, 40));

            JLabel labelPlayer = new JLabel(highNames[x]);
            labelPlayer.setFont(new Font("Bodoni MT", 0, 20));
            labelPlayer.setForeground(new Color(255, 255, 255));

            JLabel labelScore = new JLabel(String.valueOf(highScores[x]));
            labelScore.setFont(new Font("Segoe UI", 0, 20));
            labelScore.setForeground(new Color(255, 255, 255));
            labelScore.setHorizontalAlignment(SwingConstants.CENTER);

            playerPanel.add(labelPlayer);
            playerPanel.add(labelScore);

            panelScrollLeaderB.add(playerPanel);
        }

        // Create a JScrollPane and add the leaderboard panel to it
        JScrollPane scrollLeaderboard = new JScrollPane(panelScrollLeaderB);
        scrollLeaderboard.setBackground(new Color(45, 81, 40));
        scrollLeaderboard.setBorder(null);
        scrollLeaderboard.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollLeaderboard.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollLeaderboard.setOpaque(false);

        // Add the JScrollPane to the frame
        frame.add(scrollLeaderboard);
        frame.setVisible(true);
    }
}
