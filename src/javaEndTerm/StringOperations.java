package javaEndTerm;

public class StringOperations {
    public static void main(String[] args) {

        String name = "Ankit Raj";

        //different string operations.
        System.out.println(name.length()); //gives the length of the string.
        System.out.println(name.charAt(4)); //returns the character at a particular index
        System.out.println(name.toUpperCase());  //to convert our string to uppercase
        System.out.println(name.toLowerCase());  // to convert our string to lowercase
        System.out.println(name.contains("a")); //checks if the gives string is present in original string

        System.out.println(name.concat("xyz")); //concatenate the given string to the original string
        System.out.println(name.replace("A","O")); // replace the target string with desired string.

    }
}
