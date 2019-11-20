package remoteMI.defaultRMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class AddCLient {
    public static void main(String[] args) {
        String host = "localhost";
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter a :");
        int a = sc.nextInt();
        System.out.println("Eneter b :");
        int b = sc.nextInt();

        try{
            AddRem remobj = (AddRem) Naming.lookup("rmi://localhost:1900"+ "/AddRem");
            System.out.println(remobj.addNum(a,b));
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
