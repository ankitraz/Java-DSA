package Arrays_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 7; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(list);
    }
}
