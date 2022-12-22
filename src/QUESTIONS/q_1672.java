package QUESTIONS;

public class q_1672 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,4,6,3},
                {4,6,7,1,0},
                {1,3,4}
        };
        System.out.println(maximumWealth(arr));
    }

    static int maximumWealth(int[][] account){
        int[] arr = new int[account.length];
        for (int i = 0; i < account.length; i++) {
            int temp = 0;
            for (int j = 0; j < account[i].length; j++) {
                temp = temp + account[i][j];
            }
            arr[i] = temp;
        }
        return maxNo(arr);
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
}
