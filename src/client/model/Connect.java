package client.model;

import Boggle.ClientInterface;
import Boggle.ClientInterfaceHelper;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

public class Connect {
    public ClientInterface clientInterfaceImplementation;
    public void createConnection(String[] args){
        try {
            ORB orb = ORB.init(args,null);
            org.omg.CORBA.Object objectRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objectRef);

            String name = "Boggle";
            clientInterfaceImplementation = ClientInterfaceHelper.narrow(ncRef.resolve_str(name));

            System.out.println("Connected to Server");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
