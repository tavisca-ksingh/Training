package serverlet.sreverCallRegistry;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true){
            Socket socket = serverSocket.accept();
            ObjectInputStream oin = new ObjectInputStream(socket.getInputStream());
            String input = (String) oin.readUTF();
            System.out.println(input);
        }
    }
}
