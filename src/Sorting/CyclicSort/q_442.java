package Sorting.CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class q_442 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));

    }

    static List<Integer> findDuplicates(int[] nums) {
        cyclicSort(nums);
        List <Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i+1){
                ans.add(nums[i]);
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
