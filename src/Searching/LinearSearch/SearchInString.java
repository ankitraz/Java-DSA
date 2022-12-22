package Searching.LinearSearch;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Ankit";
        System.out.println(searchinString(name, 'i'));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean searchinString(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
