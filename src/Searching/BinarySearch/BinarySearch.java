package Searching.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,7,8,10};
        int[] arr1 = {98,46,23,11,2,1};

        System.out.println(orderAgnostics(arr1, 11));

    }

    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid] == target){
                return mid;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else end = mid - 1;
        }
        return -1;
    }
    static int binarysearchfordecending(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid] == target){
                return mid;
            }
            else if (target > arr[mid]){
                end = mid - 1;
            }
            else start = mid + 1 ;
        }
        return -1;
    }

    static int orderAgnostics(int[] arr,int target){
        if (arr[0] > arr[arr.length-1]){    // it means our array is sorted in descending order.
            return binarysearchfordecending(arr,target);
        }
        else if (arr[0] < arr[arr.length-1]){ // it meant our array is sorted in ascending order.
            return binarysearch(arr,target);
        }
        return -1;
    }

}
