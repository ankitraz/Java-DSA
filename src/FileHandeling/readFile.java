package FileHandeling;

import java.io.File;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) {
        File newfile = new File("Ankit.txt");

        try {
            Scanner sc = new Scanner(newfile);
            while (sc.hasNext()){
                String text = sc.nextLine();
                System.out.println(text);
            }
            sc.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
