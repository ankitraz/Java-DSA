package javaEndTerm;

public class twodimArrayMultiplication {
    public static void main(String[] args) {
        int [][] arr1 = {{1,2,3},{2,3,4},{1,1,1}};
        int [][] arr2 = {{2,1,1},{4,1,4},{1,1,1}};
        multiplication(arr1,arr2);
    }

    public static void multiplication(int[][] arr1, int[][] arr2){
        int[][] result = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        //print the resultant matrix
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
