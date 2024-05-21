package client;

import Boggle.ClientInterfaceHelper;
import client.model.Connect;
import client.view.Menu.LogIn;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import server.model.ClientInterfaceImplementation;

public class MainClient {
    public static Connect connect = new Connect();
    public static String username = null;
    public static ClientInterfaceImplementation clientInterfaceImplementation;

    public static void main(String[] args) {
        try {
            ORB orb = ORB.init(args,null);
            org.omg.CORBA.Object objectRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objectRef);

            String name = "Boggle";
            clientInterfaceImplementation = (ClientInterfaceImplementation) ClientInterfaceHelper.narrow(ncRef.resolve_str(name));

            System.out.println("Connected to Server");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        new LogIn().setVisible(true);
    }

}
