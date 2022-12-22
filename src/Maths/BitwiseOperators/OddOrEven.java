package Maths.BitwiseOperators;

public class OddOrEven {
    public static void main(String[] args) {
        isOddorEven(55);
    }

    static void isOddorEven(int num) {
        if ((num & 1) == 0) {
            System.out.println("Even");
        } else
            System.out.println("Odd");
    }
}
