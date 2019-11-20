package remoteMI.coustomRMI.Bank;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class BankImpl extends UnicastRemoteObject implements Bank {
    public BankImpl() throws RemoteException {
        super();
    }

    public List<Customer> getCustomers() {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer(1,"chandu" , 50000));
        list.add(new Customer(2,"Superman" , 12000));
        list.add(new Customer(3,"Ram" , 20000));
        list.add(new Customer(4,"Batman" , 30000));
        list.add(new Customer(5,"Wolverin" , 40000));
        return list;
    }
}
