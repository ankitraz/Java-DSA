package Threading;

class thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {

            System.out.println("this is thread 1.");
        }
    }
}

class thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {

            System.out.println("this is thread 2");
        }
    }
}


public class javaThreading {
    public static void main(String[] args) {
        thread1 t = new thread1();
        thread2 t2 = new thread2();

        t.start();
        t2.start();
    }
}

