package Maths.BitwiseOperators;

public class ithBit {
    public static void main(String[] args) {
        System.out.println(IthBit(56));
    }

    static int IthBit(int n){
        int mask = 1<<(n-1);
        return n&mask;
    }
}
