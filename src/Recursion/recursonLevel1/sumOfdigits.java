package Recursion.recursonLevel1;

public class sumOfdigits {
    public static void main(String[] args) {
        System.out.println(sumofdigits(234));
    }

    static int sumofdigits(int n){
        if (n==0){
            return 0;
        }
        return (n%10)+sumofdigits(n/10);
    }
}
