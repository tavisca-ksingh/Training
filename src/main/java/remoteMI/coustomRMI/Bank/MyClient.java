package remoteMI.coustomRMI.Bank;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

public class MyClient {
    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
        Bank b = (Bank) Naming.lookup("rmi://localhost:6666/bank");
        List<Customer> list=b.getCustomers();
        for(Customer c:list){
            System.out.println(c.getAcc_no()+" "+c.getName()+" "+c.getAmount());
        }
    }
}
