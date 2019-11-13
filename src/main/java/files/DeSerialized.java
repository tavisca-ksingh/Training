package files;




import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialized {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        FileInputStream fileInputStream = new FileInputStream("dataStored.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
        Account object = (Account) objectInputStream.readObject();
        System.out.println(object.getName());
        bufferedInputStream.close();
        objectInputStream.close();

    }
}
