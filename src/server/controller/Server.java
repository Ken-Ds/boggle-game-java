package server.controller;

import Boggle.ClientInterface;
import Boggle.ClientInterfaceHelper;
import Boggle.Player;
import Boggle._ClientInterfaceStub;
import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import server.model.ClientInterfaceImplementation;
import server.model.ParseDatabase;
import server.view.mainComponents.ServerMain;

import java.util.*;

public class Server{
    private ORB orb;
    private Map<String, Player> players;
    private List<Player> currentGame;
    private int waitingTime;
    private int roundDuration;
    private Set<String> usedWords;

    public void startServer(String args[]){
        orb = ORB.init(args,null);
        try {
            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootPOA.the_POAManager().activate();

            ClientInterfaceImplementation clientInterfaceImplementation = new ClientInterfaceImplementation();

            org.omg.CORBA.Object ref = rootPOA.servant_to_reference(clientInterfaceImplementation);
            ClientInterface cRef = ClientInterfaceHelper.narrow(ref);

            org.omg.CORBA.Object objectRef = orb.resolve_initial_references("NameService");

            NamingContextExt ncRef = NamingContextExtHelper.narrow(objectRef);

            String name = "Boggle";
            NameComponent path[] = ncRef.to_name(name);

            ncRef.rebind(path,cRef);
            System.out.println("Server Running");
            new ServerMain().setVisible(true);
            orb.run();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void startGame(String username){

    }
}
