package QUESTIONS;

public class PrimeNumsTillN {
    public static void main(String[] args) {
        PrimeNumbers(4, 12);
    }

    static void PrimeNumbers(int low, int high) {

        int count = 0;
        for (int i = low; i <= high; i++) {
            for (int j = 2; j * j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
                if (count == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
