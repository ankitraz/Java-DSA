package OOP.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human ankit = new Human(21, "Ankit", 1000,false);
        Human Rahul = new Human(21, "Rahul", 1000,false);
        System.out.println(ankit.name);

        System.out.println(ankit.population);
        System.out.println(Rahul.population);
        System.out.println(Human.population);
        Main m1 = new Main();
        m1.greeting();
    }
    // we know that something which is not staic, belongs to an object
    void greeting(){ // this is dependent on some object of the class
        System.out.println("Hellow world");
        fun();// this is allowed we can call static funtion from non static
    }

    void fun2(){
        greeting();
    }
    static void fun(){// this is independent of object
        Main obj = new Main();
        obj.greeting(); // this will work
//        greeting(); // you cant use this because it requires an instance
        // but the function you are using it in does not depend instances
    }
}
