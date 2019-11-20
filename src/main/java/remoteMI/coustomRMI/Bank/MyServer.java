package remoteMI.coustomRMI.Bank;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class MyServer {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Remote r = new BankImpl();
        LocateRegistry.createRegistry(6666);
        Naming.rebind("rmi://localhost:6666/bank",r);
    }
}
