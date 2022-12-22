package Arrays_ArrayList;

import java.util.Arrays;

public class basicArray{
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr1 = {1,3,45,5,6};

        arr[0] = 1;
        arr[1] = 4;
        arr[2] = 5;
        arr[3] = 7;
        arr[4] = 8;

//        System.out.println(arr[1]);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print (arr[i]+ " ");
//        }

//        System.out.println(Arrays.toString(arr));
        for (int element :
                arr) {
            System.out.print(element + " ");
        }



    }
}
