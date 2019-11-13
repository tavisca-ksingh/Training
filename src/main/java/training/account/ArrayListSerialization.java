package training.account;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayListSerialization {
    public static void main(String[] args) throws IOException {
//        List<Account1> accountList = new ArrayList<>();
//        accountList.add(new Account1("abc",5000));
//        accountList.add(new Account1("deg",3000));
//        accountList.add(new Account1("ghi",4999));

        Account1 [] account = new Account1[3];
        account[0] = new Account1("abc",5000);
        account[1] = new Account1("def",4000);
        account[2] = new Account1("ghi",3000);
        FileOutputStream fout = new FileOutputStream("arraylistSerialized.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(account);
        out.close();
        fout.close();

    }
}
