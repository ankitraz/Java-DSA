package JavaSocketProgramming;
import com.sun.source.tree.Scope;

import java.io.*;
import java.net.*;
public class Myclient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("supp bro");
            dout.write(6);
            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
