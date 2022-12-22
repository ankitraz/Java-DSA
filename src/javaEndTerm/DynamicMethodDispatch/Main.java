package javaEndTerm.DynamicMethodDispatch;

class shape{
    public void draw(){
        System.out.println("Drawing a shape.");
    }
}

class circle extends shape{
    @Override
    public void draw(){
        System.out.println("Drawing a circle.");
    }
}

class square extends shape{
    @Override
    public void draw(){
        System.out.println("Drawing a square.");
    }
}

public class Main {
    public static void main(String[] args) {
        shape shape1 = new circle();
        shape shape2 = new square();

        shape1.draw();
        shape2.draw();
    }
}
