package javaEndTerm;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(6666);
            Socket s = server.accept();
            DataInputStream data = new DataInputStream(s.getInputStream());
            String str = (String) data.readUTF();
            System.out.println(str);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
