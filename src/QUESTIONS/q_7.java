package QUESTIONS;//program to reverse a number

public class q_7 {
    public static void main(String[] args) {
        System.out.println(reverse(-8695));
    }

    static int reverse(int x) {
        int temp1 = 0;
        int temp2 = x;
        if (x < 0) {
            x = x * (-1);
        }
        while (x > 0) {
            temp1 = temp1 * 10 + x % 10;
            x = x / 10;
        }
        if (temp2 < 0) {
            return temp1 * -1;
        } else
            return temp1;
    }
}
