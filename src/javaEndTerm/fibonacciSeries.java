package javaEndTerm;

public class fibonacciSeries {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.println(fibo(i));
        }
    }

    public static int fibo(int n){
        if (n == 0 ){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
