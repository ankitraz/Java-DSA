package Maths.BitwiseOperators;

public class repeatedNum {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,1,3,6,6,4};
        System.out.println(UniqueNUm(arr));
    }

    static int UniqueNUm(int[] arr){
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num ^ arr[i];
        }
        return num;
    }
}
