package FileHandeling;
import java.io.*;
public class writeAFile {
    public static void main(String[] args) {
        File newfile = new File("Ankit.txt");

        try{
            FileWriter f = new FileWriter("Ankit.txt");
            f.write("hue hue hue");
            System.out.println("file written!!");
            f.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
