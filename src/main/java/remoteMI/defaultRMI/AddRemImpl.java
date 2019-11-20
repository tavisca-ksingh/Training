package remoteMI.defaultRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddRemImpl extends UnicastRemoteObject implements AddRem {

    public AddRemImpl() throws  RemoteException{}

    @Override
    public int addNum(int a, int b)  {
        return (a + b);
    }
}
