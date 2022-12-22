package QUESTIONS;

public class q_744 {
    public static void main(String[] args) {
        char[] arr = {'a', 'f', 'j'};
        System.out.println(nextGreatestLetter(arr, 'g'));
    }


    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = end + (start - end) / 2;

            if (target > letters[mid]) {
                start = mid + 1;
            } else if (target < letters[mid]) {
                end = mid - 1;
            }
        }
        if (start == letters.length) {
            return letters[0];
        }
        return letters[start];
    }
}

