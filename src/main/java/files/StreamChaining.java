package files;

import java.io.*;

public class StreamChaining {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("abc.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        FileOutputStream fileOutputStream = new FileOutputStream("def.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fileOutputStream);
        bout.write(bin.readAllBytes());
        bin.close();
        fin.close();
        bout.close();
        fileOutputStream.close();
    }
}
