package serverlet;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerCode {


    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(2000);
        Socket s=serverSocket.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  str = "", str2 ="";

        while (!str.equals("e")){
            str = dis.readUTF();
            System.out.println("Client : " + str);
            System.out.println("Enter data to send : ");
            str2 = br.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }
        dis.close();
        s.close();
        serverSocket.close();
    }
}
