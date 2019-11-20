package serverlet;

import java.io.*;
import java.net.Socket;

public class ClientCode {

    public static void main(String[] args) throws IOException {
        Socket s=new Socket("localhost",2000);

        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        DataInputStream din = new DataInputStream(s.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str="",str2="";
        while(!str.equals("e")){
            System.out.println("Enter data to send : ");
            str=br.readLine();
            dout.writeUTF(str);
            dout.flush();
            str2=din.readUTF();
            System.out.println("Server : "+str2);
        }

        dout.close();
        s.close();
    }

}
