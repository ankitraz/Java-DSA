package Searching.BinarySearch.BSinterviewQues;

public class CeilingAndFloor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(ceiling(arr,4));
//        System.out.println(floor(arr,15));
    }

    static int ceiling(int[] arr, int target){
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
        return start;
    }

    static int floor(int[] arr, int target){
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
        return end;
    }
}
