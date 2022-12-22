package Recursion.recursonLevel1;

public class countZeros {
    public static void main(String[] args) {
        System.out.println(count(4560));
    }



    static int count(int n){
        return helper(n, 0);
    }

    static int helper(int num, int count){
        if (num == 0){
            return count;
        }
        if (num%10 == 0){
            return helper(num/10,count+1);
        }
        else return helper(num/10, count);
    }

}
