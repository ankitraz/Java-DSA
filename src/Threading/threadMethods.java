package Threading;

class Mythread1 extends Thread {


    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("Thank you" + this.getName());
            i++;
        }
    }
}

class Mythread2 extends Thread{
    @Override
    public void run() {
        System.out.println("this is thread2-------------------");
    }
}


public class threadMethods {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        t1.start();
        try {
//            t1.join();
            Thread.sleep(66933);
        } catch (Exception e) {
            System.out.println(e);
        }
        // what we want is we want to execute t2 only when t1 is finished. use t1.join


        t2.start();
    }
}
