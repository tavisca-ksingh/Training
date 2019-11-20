package remoteMI.defaultRMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class AddServer {
    public static void main(String[] args) {
        try {
            AddRemImpl locObj = new AddRemImpl();
            LocateRegistry.createRegistry(1900);
            Naming.rebind("rmi://localhost:1900/AddRem" , locObj);

        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
