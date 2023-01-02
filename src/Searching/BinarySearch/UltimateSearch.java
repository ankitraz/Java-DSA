package Searching.BinarySearch;
import Searching.LinearSearch.*;
public class UltimateSearch {
    public static void main(String[] args) {
        int[] arr = {1,3,6,9,15,23};
        int target = 3;

        ultimateSearch(arr,target);

    }


    static void ultimateSearch(int[] arr,int target){
        boolean ascendingsorted = whetherascendingSorted(arr);
        boolean descendingsorted = whetherdescendingSorted(arr);

        if (ascendingsorted){
            System.out.println("Array is sorted in ascending order, applying binary search accordingly.");
            System.out.println(BinarySearch.binarysearchforascending(arr, target));
        } else if (descendingsorted) {
            System.out.println("Array is sorted in descending order, applying binary search accordingly.");
            System.out.println(BinarySearch.binarysearchfordecending(arr,target));
        } else {
            System.out.println("Array is not sorted, applying linear search.");
            System.out.println(LinearSearch.linearSearch(arr,target));
        }
    }



    static boolean whetherascendingSorted(int[] arr){
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<arr[i-1]){
                check = false;
                break;
            }
        }
        return check;
    }

    static boolean whetherdescendingSorted(int[] arr){
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] < arr[i]){
                check = false;
                break;
            }
        }
        return check;
    }
}
