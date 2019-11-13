package files;

import java.io.*;

public class Serialized {

    public static void main(String[] args) throws IOException {
        Account acc = new Account(123,"Super Man",90000);
        FileOutputStream fout = new FileOutputStream("data.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(acc);
        out.close();
        fout.close();
    }
}
