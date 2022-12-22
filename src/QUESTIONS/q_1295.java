package QUESTIONS;

public class q_1295 {
    public static void main(String[] args) {
        int[] arr = {1, 2422, 76, 569098};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count(noofDigits(nums[i]))) {
                ans++;
            }
        }
        return ans;
    }

    static int noofDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    static boolean count(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}
