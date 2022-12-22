package javaEndTerm;

import java.util.Arrays;

public class findMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        System.out.println(findmissing(arr));
    }

    public static int findmissing(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1){
                return i+1;
            }
        }
        return -1;
    }
}
