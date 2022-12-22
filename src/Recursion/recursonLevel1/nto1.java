package Recursion.recursonLevel1;

public class nto1 {
    public static void main(String[] args) {
        fun(5);
//        fun2(5);
//        funboth(5);
    }


    static void fun(int n){
//        if (n==0){
//            return;
//        }
        // or we can use if(n==1){just print the 1} and return;
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        fun(n-1);
    }

    static void fun2(int n){
        if (n==0){
            return;
        }
        fun2(n-1);
        System.out.println(n);
    }


    static void funboth(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        funboth(n-1);
        System.out.println(n);
    }
}
