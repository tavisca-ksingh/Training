package proxyServerWithSocket;

import java.io.*;
import java.net.Socket;

public class ThreadProxy extends Thread {
    private Socket sClient;
    private final String SERVER_URL;
    private final int SERVER_PORT;


    public ThreadProxy(Socket sClient, String server_url, int server_port) {
        this.sClient = sClient;
        SERVER_URL = server_url;
        SERVER_PORT = server_port;
        this.start();
    }
    @Override
    public void run(){
        try {
            final byte[] request = new byte[1024];
            byte[] reply = new byte[4096];
            final InputStream inFromClient = sClient.getInputStream();
            final OutputStream outToClient = sClient.getOutputStream();
            Socket client = null, server = null;
            try{
                server = new Socket(SERVER_URL,SERVER_PORT);
            }catch (IOException e){
                PrintWriter out = new PrintWriter(new OutputStreamWriter(outToClient));
                out.flush();
                throw new RuntimeException(e);
            }

            final InputStream inFromServer = server.getInputStream();
            final OutputStream outToServer = server.getOutputStream();

            new Thread(){
                public void run(){
                    int bytes_read;
                    try{
                        while ((bytes_read = inFromServer.read(request)) != -1){
                            outToServer.write(request, 0 , bytes_read);
                            outToServer.flush();
                            outToServer.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
