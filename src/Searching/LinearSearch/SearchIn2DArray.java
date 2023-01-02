package Searching.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,4},
                {3,5,89},
                {1,3}
        };

        System.out.println(Arrays.toString(search(arr,3)));
        System.out.println(max(arr));
        System.out.println(min(arr));

    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    static int min(int[][] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}
