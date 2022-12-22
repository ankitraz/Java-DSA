package Maths.maths;

public class Seive {
    public static void main(String[] args) {
        int n = 20;
        boolean[] arr = new boolean[n+1];
        nprime(n,arr);
    }


    static void nprime(int n, boolean[] arr){
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (arr[i]==false){
                // j is initialized to (i+i or i*2) because for ex -  we don't want 2 to become true in our array
                // we just need to convert multiples of 2 to true hence start j from 4. and update j in multiple of 3
                // similarly for 3 -  eliminate multiples of 3 but do not turn 3 to true
                // hence in this case start j from 6. and update j in multiple of 3
                for (int j = i+i; j <= n; j = j+i) {
                    arr[j] = true;
                }
            }
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i]==false){
                System.out.print(i + " ");
            }
        }
    }
}
