package trial;

import Boggle.AlreadyLoggedIn;
import Boggle.IsNotUser;
import client.model.Connect;

import java.util.Scanner;

public class client {
    private static Connect connect = new Connect();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        connect.createConnection(args);
        System.out.println("Log In");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        try {
            connect.clientInterfaceImplementation.logIn(username,password);
            System.out.println("Log IN Successful");

        } catch (AlreadyLoggedIn e) {
            System.out.println(e);;
        } catch (IsNotUser e) {
            System.out.println(e);
        }

    }
}
