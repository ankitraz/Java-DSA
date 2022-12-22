package QUESTIONS;

import java.util.ArrayList;
import java.util.Arrays;

public class q_34 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(nums, 1)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] arr = {-1, -1};
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                arr[0] = mid;
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else end = mid - 1;
        }

        int start1 = 0;
        int end1 = nums.length - 1;
        while (start1 <= end1) {
            int mid1 = start1 + (end1 - start1) / 2;
            if (nums[mid1] == target) {
                arr[1] = mid1;
                start1 = mid1 + 1;
            } else if (target > nums[mid1]) {
                start1 = mid1 + 1;
            } else end1 = mid1 - 1;
        }
        return arr;
    }
}
