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
        for (int row = 0; row < account.length; row++) {
            int temp = 0;
            for (int col = 0; col < account[row].length; col++) {
                temp = temp + account[row][col];
            }
            arr[row] = temp;
        }
        return maxNo(arr);
    }
    static int maxNo(int[] arr){
        int temp = arr[0];
        for (int j : arr) {
            if (j > temp) {
                temp = j;
            }
        }
        return temp;
    }
}

