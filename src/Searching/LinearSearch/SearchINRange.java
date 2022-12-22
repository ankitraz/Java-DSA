package Searching.LinearSearch;

public class SearchINRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,54};
        System.out.println(linearSearch(arr,4,0,3));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        for (int i = start; i <= end; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
