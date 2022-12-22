package Recursion.recursonLevel1;

public class reverse {
    public static void main(String[] args) {
        System.out.println(reversenum(234578));
    }



    static int reversenum(int n){
        int digits = (int) (Math.log10(n) + 1);
        return helper(n,digits);
    }
    static int helper(int n, int base){
        if (n==0){
            return 0;
        }

        return (int) ((n%10) * Math.pow(10, base-1) + helper(n/10, base-1));
    }
}
