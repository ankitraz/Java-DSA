package Recursion;

public class FibonacciNUmber {
    public static void main(String[] args) {
//        System.out.println(fibo(12));
//        System.out.println(OptimizedFibo(12));

        for (int i = 0; i < 9; i++) {
            System.out.println(fibo(i));
        }
        System.out.println();
        for (int i = 0; i < 9; i++) {
            System.out.println(OptimizedFibo(i));
        }
    }

    static int fibo(int num) {
        if (num < 2) {
            return num;
        }
        return fibo(num - 1) + fibo(num - 2);
    }

    // optimized solution via akra bazzi method

    static int OptimizedFibo(int num) {
        double ans = 1 / Math.sqrt(5) * Math.pow(((1 + Math.sqrt(5)) / 2), num);
        if ((num & 1) == 1) {
            return (int) (ans + 1);
        }
        return (int) ans;
    }
}

