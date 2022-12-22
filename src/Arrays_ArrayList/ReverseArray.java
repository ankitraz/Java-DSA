package Arrays_ArrayList;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int z = (arr.length-1)/2;
        if (arr.length % 2 == 0 ){
            z = (arr.length/2)-1;
        }
        for (int i = 0; i <= z ; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-1-i] = temp;
        }
    }
}
