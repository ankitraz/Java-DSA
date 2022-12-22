package javaEndTerm;

    public class reverseString {
        public static void main(String[] args) {
            System.out.println(reverse("Hellow"));

        }

        public static String reverse(String s){
            String newstr = "";
            for (int i = s.length()-1; i >=0; i--) {
                newstr = newstr + s.charAt(i);
            }
            return newstr;
        }
    }
