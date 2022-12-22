package QUESTIONS;

public class q_1293 {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 62, 7896};
        // return number of those numbers who have even numbers of digits
        System.out.println(FindNumbers(nums));
    }

    static int FindNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isEven(nums[i])) {
                count++;
            }
        }
        return count;
    }

    static boolean isEven(int num) {
        if (no_of_digits(num) % 2 == 0) {
            return true;
        }
        return false;
    }

    static int no_of_digits(int digits) {
        int count = 0;
        while (digits > 0) {
            digits = digits / 10;
            count++;
        }
        return count;
    }

}
