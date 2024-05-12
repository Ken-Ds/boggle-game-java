package trial;

import Boggle.AlreadyLoggedIn;
import Boggle.IsNotUser;
import client.model.Connect;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class client {
    private static Connect connect = new Connect();
    private static Scanner scanner = new Scanner(System.in);

    private static String username;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        connect.createConnection(args);
        System.out.println("Log In");
        System.out.print("Username: ");
        username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        try {
            connect.clientInterfaceImplementation.logIn(username,password);
            System.out.println("Log IN Successful");
            System.out.print("Enter s to Start Game: ");
            String s = scanner.nextLine();
            if (s.equalsIgnoreCase("s")) {
                connect.clientInterfaceImplementation.startGame(username);
                startTime(connect.clientInterfaceImplementation.getWaitingTime(username));
                while (connect.clientInterfaceImplementation.getWaitingTime(username)!=0){
                }

                while ((connect.clientInterfaceImplementation.getRoundTime(username)+1) != 0){
                    System.out.print("Enter Words: ");
                    String word = scanner.nextLine();
                    connect.clientInterfaceImplementation.submitWord(word,username);
                    System.out.println(connect.clientInterfaceImplementation.getRoundTime(username));
                    if (connect.clientInterfaceImplementation.getRoundTime(username) == 0){
                        break;
                    }
                }
                System.out.println("Round Ended");

                System.out.println("Your Score is ");
            } else
                System.exit(0);
        } catch (AlreadyLoggedIn e) {
            System.out.println(e);
        } catch (IsNotUser e) {
            System.out.println(e);
        }

    }

    public static void startTime(int seconds) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int countdown = seconds;

            @Override
            public void run() {
                if (countdown > 0) {
                    System.out.println("Time remaining: " + countdown + " seconds");
                    countdown--;
                } else {
                    if(connect.clientInterfaceImplementation.gameStatus(username)) {
                        System.out.println("Game Started!");
                        System.out.println(showLetters(connect.clientInterfaceImplementation.getLetters(username)));
                    } else {
                        System.out.println("Game Not Started");
                    }
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 1000, 1000);
    }

    public static String showLetters(char[] letters){
        StringBuilder stringBuilder = new StringBuilder();
        int column = 0;
        for (Character c : letters){
            stringBuilder.append(c+"   ");
            column++;
            if (column == 5){
                column = 0;
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
