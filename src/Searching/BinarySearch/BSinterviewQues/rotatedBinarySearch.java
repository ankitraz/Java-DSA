package Searching.BinarySearch.BSinterviewQues;

import org.w3c.dom.html.HTMLAreaElement;

public class rotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
//        System.out.println(searchinRotatedArray(arr, 2));
//        System.out.println(searchinRotatedArrayWithduplicates(arr, 2));
        System.out.println(rotatationCount(arr));

    }


    static int searchinRotatedArray(int[] arr, int target) {
        int start = 0;
        int pivot = pivot(arr, 0, arr.length - 1);

        if (pivot == -1) {
            return binarysearchInrange(arr, target, 0, arr.length - 1);
        }
        if (target == pivot) {
            return pivot;
        }
        if (target > arr[0]) {
            return binarysearchInrange(arr, target, 0, pivot - 1);
        } else return binarysearchInrange(arr, target, pivot + 1, arr.length - 1);
    }

    static int searchinRotatedArrayWithduplicates(int[] arr, int target) {
        int start = 0;
        int pivot = pivotForDuplicateValues(arr, 0, arr.length - 1);

        if (pivot == -1) {
            return binarysearchInrange(arr, target, 0, arr.length - 1);
        }
        if (target == pivot) {
            return pivot;
        }
        if (target > arr[0]) {
            return binarysearchInrange(arr, target, 0, pivot - 1);
        } else return binarysearchInrange(arr, target, pivot + 1, arr.length - 1);
    }


    static int pivot(int[] arr, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return -1;
    }

    static int pivotForDuplicateValues(int[] arr, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] == arr[mid] && arr[start] == arr[end]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                } else if (arr[start] < arr[start - 1]) {
                    return start - 1;
                }
                start++;
                end--;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return -1;
    }

    static int binarysearchInrange(int[] arr, int target, int start, int end) {

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

    static int rotatationCount(int[] arr) {
        int pivot = pivot(arr, 0, arr.length - 1);
        return pivot + 1;
    }

}
