package Recursion;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 7, 8};

        System.out.println(bs(arr, 6, 0, arr.length));
    }

    static int bs(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (start > end) {
            return -1;
        }
        if (target == arr[mid]) {
            return mid;
        } else if (target > arr[mid]) {
            return bs(arr, target, start + 1, end);
        } else return bs(arr, target, start, end - 1);

    }
}
