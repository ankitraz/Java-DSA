package QUESTIONS;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30};  //suppose this is the infinite array
        System.out.println(infiniteArray(arr, 23));
//        System.out.println(infiniteArrayBS(arr, 11));
    }


    static int infiniteArray(int[] arr, int target) {
        int start = 0;
        int end = 1;

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
            int temp = end + 1;
            end = end * 10;
            start = temp;
            // new end = previous end + size of box *2
//            end = end + (end - start + 1) * 2;
        }

        return -1;
    }

    static int infiniteArrayBS(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > end) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else end = mid - 1;
        }
        return -1;
    }
}
