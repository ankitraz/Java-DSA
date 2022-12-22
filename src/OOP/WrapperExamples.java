package OOP;

public class WrapperExamples {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
        Integer num1 = 45;
        // now our num is not primitive, it comes with so many functions its an object
//        swap(a,b);
        // this wont swap because of pass by value
        Integer a =10;
        Integer b= 20;
        swap(a,b);
        System.out.println(a + " " + b);
// it still wont swap because of Integer class is final.

    }

   static void swap(Integer a,Integer b){
        int temp = a;
        a =b;
        b=temp;
    }

}
