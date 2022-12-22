package javaEndTerm;

import java.io.DataOutputStream;
import java.net.Socket;

public class client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);
            DataOutputStream data = new DataOutputStream(s.getOutputStream());
            data.writeUTF("Hellow bro");
            data.flush();
            data.close();
            s.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
