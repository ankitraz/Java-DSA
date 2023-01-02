package QUESTIONS;

public class MaxNo {
    static int maxNo(int[] arr){
        int temp = arr[0];
        for (int j : arr) {
            if (j > temp) {
                temp = j;
            }
        }
        return temp;
    }

    static int minNo(int[] arr){
        int temp = arr[0];
        for (int i : arr) {
            if (i < temp) {
                temp = i;
            }
        }
        return temp;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,8,12,0,34};
        System.out.println(maxNo(arr));
        System.out.println(minNo(arr));
    }

}
