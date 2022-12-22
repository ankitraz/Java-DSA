package OOP;
// final is a keyword by which you can choose not to modify our variable

public class finalKeyword {
    public static void main(String[] args) {
       final int a = 10;
//       a =20; // will give error
        /// final variable has to initialize.
        // Always initialize it while declaring it.

    }
}
// finaliser

class A{
    final int num = 10;
    String name;

    A(String name){
        System.out.println("Objext is being created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
