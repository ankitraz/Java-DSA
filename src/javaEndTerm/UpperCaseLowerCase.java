package javaEndTerm;

public class UpperCaseLowerCase {
    public static void main(String[] args) {
        System.out.println(lowercase("HELLOWORLD"));
        System.out.println(uppercase("helloworld"));
    }

    public static String lowercase(String s){
        return s.toLowerCase();
    }

    public static String uppercase(String s){
        return s.toUpperCase();
    }
}
