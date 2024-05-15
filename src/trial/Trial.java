package trial;

import server.referenceclass.Game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Timer;
import java.util.TimerTask;

public class Trial{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Countdown Timer Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel countdownLabel = new JLabel();
        frame.add(countdownLabel);

        frame.setSize(300, 200);
        frame.setVisible(true);

        // Set the duration of the countdown in seconds
        int countdownDuration = 60;

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int remainingTime = countdownDuration;

            @Override
            public void run() {
                if (remainingTime > 0) {
                    SwingUtilities.invokeLater(() -> countdownLabel.setText("Time Remaining: " + remainingTime + " seconds"));
                    remainingTime--;
                } else {
                    timer.cancel();
                    SwingUtilities.invokeLater(() -> countdownLabel.setText("Countdown Finished!"));
                }
            }
        };

        // Schedule the task to run every second (1000 milliseconds)
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
