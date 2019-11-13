package training.account;

import files.Account;

import java.io.*;
import java.util.ArrayList;

public class ArrayListDeserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BufferedInputStream bin = new BufferedInputStream(new FileInputStream("arraylistSerialized.txt"));
        ObjectInputStream objectInputStream = new ObjectInputStream(bin);
        Object object = objectInputStream.readObject();
        //ArrayList<Account1> acc = (ArrayList<Account1>) object;
        Account1 [] acc = (Account1[]) object;
         System.out.println(acc[0].getAccountType()+ "  " + acc[0].getBalance());
         objectInputStream.close();

    }
}
