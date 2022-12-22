package QUESTIONS;

public class q_852 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 2, 1};
//        System.out.println(peakIndexInMountainArray(arr));
        System.out.println(findInmountainArray(arr, 3));

    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (start == end) {
                return start;
            } else if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else start = mid + 1;
        }
        return -1;
    }

    static int findInmountainArray(int[] arr, int target) {
        int start = 0;
        int peak = peakIndexInMountainArray(arr);

        int ans1 = binarySearchinrange(arr, target, start, peak);
        int ans2 = binarysearchfordecending(arr, target, peak, arr.length - 1);
        if (target == ans1) {
            return ans1;
        }
        if (ans1 == -1 && ans2 == -1) {
            return -1;
        }
        if (arr[ans1] == arr[ans2]) {
            return ans1;
        }
        return ans2;
    }


    static int binarySearchinrange(int[] arr, int target, int start, int end) {
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

    static int binarysearchfordecending(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return -1;
    }
}
