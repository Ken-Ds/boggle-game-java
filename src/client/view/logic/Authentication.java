package client.view.logic;

import client.view.Menu.HomePage;

public class Authentication {

    /**
     * Pending: Do after the method to verify account is done on the server
     */
    public static void login(String username, String password){
        if(username.equals("example") && password.equals("password")){
            HomePage homePage = new HomePage();
            homePage.setVisible(true);
        } else{
            System.out.println("INCORRECT USERNAME & PASSWORD");
        }
    }

}
