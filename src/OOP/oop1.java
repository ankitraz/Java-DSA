package OOP;

public class oop1 {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        // store 5 names
//        String[] names = new String[5];
//        Student Ankit = new Student(4,"Ankit",56);
//        System.out.println(Ankit.name);
//        Ankit.greet();
//        Student TempStudent = new Student(Ankit);
//        System.out.println(TempStudent.name);
        Student random = new Student();
//        System.out.println(random.name);
        Student random2 = random;
        System.out.println(random.name);

    }
}

// Instance variables = variables inside the object of a class
// Dynamically allocates the memory and returns the reference to it.
// in java all class objects must be allocated dynamically

// a constructors basically define what happens when your objects are created
// @ timer - 48:25 1st oop video -- funny moment



class Student{
    int roll;
    String name;
    double marks;

    //constructor overloading
    Student(){
//        roll = 0;
//        name = null;
//        marks = 0;
        this(0,"defaultstudent",0);
        //this is how you can call a constructor from another constructor
    }

    Student(int roll, String name, double marks){
        this.roll = roll;
        this.marks = marks;
        this.name = name;
    }

    void greet(){
        System.out.println("Hello " + this.name);
    }

//    Student(Student other){
//        this.roll = other.roll;
//        this.name = other.name;
//        this.marks = other.marks;
//    }
}