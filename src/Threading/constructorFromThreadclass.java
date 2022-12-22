package Threading;


class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Hello world");
    }
}


public class constructorFromThreadclass {
    public static void main(String[] args) {
        MyThr t = new MyThr("Ankit");
        t.start();
        System.out.println("The id of the thread is: " +t.getId());
        System.out.println("Name of thread: "+ t.getName());
    }
}
