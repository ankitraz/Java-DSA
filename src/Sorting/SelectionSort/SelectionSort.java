package Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastindex = arr.length-1-i;
            int maxElementIndex = maxnumindex(arr, 0, lastindex);
            swap(arr,maxElementIndex,lastindex);
        }
    }

    static int maxnumindex(int[] arr, int start, int end){
        int max = start;
        for (int i = 0; i <= end; i++) {
            if (arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
