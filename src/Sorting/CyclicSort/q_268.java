package Sorting.CyclicSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class q_268 {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(missingNumber(arr));
    }

    static public int missingNumber(int[] nums) {
        int n = nums.length;
        cyclicSort(nums);
        for (int i = 0; i < n; i++) {
            if (nums[i] != i ){
                return i;
            }
        }
        return  n;
    }

    static void cyclicSort(int[] arr){
        int i = 0;
        while ( i <arr.length){
            int correct  = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else i++;
        }
    }

    static void swap(int[] arr, int num1,int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
