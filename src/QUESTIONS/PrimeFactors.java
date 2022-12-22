package QUESTIONS;

public class PrimeFactors {
    public static void main(String[] args) {
        int[] arr = {4, 7, 76};
        AllPrimeFactors(arr);
    }

    static void AllPrimeFactors(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(1 + " ");
            for (int j = 2; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

}
