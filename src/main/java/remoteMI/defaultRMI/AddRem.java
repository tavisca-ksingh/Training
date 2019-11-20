package remoteMI.defaultRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddRem extends Remote {
    public int addNum(int a, int b) throws RemoteException;
}
