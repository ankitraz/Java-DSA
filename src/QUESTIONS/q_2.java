package QUESTIONS;

import java.util.Arrays;

public class q_2 {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        System.out.println(Arrays.toString(twoSum(arr,6)));
    }

    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]== target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
