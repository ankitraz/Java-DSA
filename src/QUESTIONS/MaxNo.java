package QUESTIONS;

public class MaxNo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,12,0,34};
        System.out.println(maxNo(arr));
        System.out.println(minNo(arr));
    }

    static int maxNo(int[] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>temp){
                temp = arr[i];
            }
        }
        return temp;
    }

    static int minNo(int[] arr){
        int temp = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]<temp){
                temp = arr[j];
            }
        }
        return temp;
    }

}
