package OOP.StaticExample;

// this is a demo to show initialisation of static variables
public class StaticVariables {
    static  int a = 4;
    static int b;


    // static block
    // will only run once, when the first obj is created i.e. when the class is loaded for first time
    static {
        System.out.println("I am in static block");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticVariables obj = new StaticVariables();
        System.out.println(StaticVariables.a + " "+ StaticVariables.b);
    }
}
