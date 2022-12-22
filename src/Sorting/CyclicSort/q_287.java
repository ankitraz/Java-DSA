package Sorting.CyclicSort;

import java.util.Arrays;

public class q_287 {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
//        cyclicSort(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] nums) {
        cyclicSort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i+1){
                ans = nums[i];
            }
        }
        return ans;
    }


    static void cyclicSort(int[] arr){
        int i = 0;
        while ( i <arr.length){
            int correct  = arr[i]-1;
            if (arr[i] != arr[correct]){
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
