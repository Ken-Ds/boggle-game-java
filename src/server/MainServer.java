package server;

import Boggle.ClientInterface;
import Boggle.ClientInterfaceHelper;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import server.model.ClientInterfaceImplementation;
import server.model.Server;
import server.model.SetJTable;
import server.view.mainComponents.ServerMain;
import server.view.serverPanels.ManageUsersPanel;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class MainServer{
    private static ORB orb;

    private static Server server = new Server();
    public static ServerMain serverMain = new ServerMain();

    public static void main(String[] args) {
        server = new Server();
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

            System.out.println("Server is Running...");
            orb.run();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
