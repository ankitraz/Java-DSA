package FileHandeling;

import java.io.*;

public class createFile {
    public static void main(String[] args){
        File newfile = new File("Ankit.txt");
        try {
            newfile.createNewFile();
            System.out.println("file created!!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
