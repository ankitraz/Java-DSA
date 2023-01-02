package QUESTIONS;

public class swapTwoVariables {

    static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }


    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}
