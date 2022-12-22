package Arrays_ArrayList;

import java.util.Arrays;

public class SwapValues {
    public static void main(String[] args) {
        int[] arr = {1,23,5,6,8};
        System.out.println(Arrays.toString(arr));
        swap(arr,2,4);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index,int target){
        int temp = arr[index];
        arr[index] = arr[target];
        arr[target] = temp;
    }
}
