package QUESTIONS;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 9, 8, 7};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

    static int[] reverseArray(int[] arr) {
        int temp;
        if (arr.length % 2 != 0) {
            for (int i = 0; i < (arr.length - 1) / 2; i++) {
                temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
        } else {
            for (int i = 0; i <= (arr.length / 2) - 1; i++) {
                temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
        }
        return arr;
    }
}
