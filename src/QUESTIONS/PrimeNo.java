package QUESTIONS;

import java.util.Arrays;

public class PrimeNo {
    public static void main(String[] args) {
        int[] arr = {5698743};
        System.out.println(Arrays.toString(isPrime(arr)));
    }

    static boolean[] isPrime(int[] arr) {
        boolean[] res = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;

            for (int j = 2; j * j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    temp++;
                    break;
                }
            }
            if (temp == 0) {
                res[i] = true;
            } else
                res[i] = false;
        }
        return res;
    }
}
