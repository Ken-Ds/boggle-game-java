package trial;

import server.referenceclass.Game;

import java.util.Hashtable;
import java.util.Timer;
import java.util.TimerTask;

public class Trial {
    public static void main(String[] args) {
        int seconds = 30;
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int countdown = seconds;
            @Override
            public void run() {
                if (countdown > 0) {
                    System.out.println("Time remaining: " + countdown + " seconds");
                    countdown--;
                } else {
                    System.out.println("Time's up!");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 1000, 1000);
    }
}
