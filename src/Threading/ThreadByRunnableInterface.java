package Threading;

class thr1 implements Runnable{
    @Override
    public void run() {
        System.out.println("this is thread 1");
    }
}

class thr2 implements Runnable{
    @Override
    public void run() {
        System.out.println("this is thread 2");
    }
}


public class ThreadByRunnableInterface {
    public static void main(String[] args) {
        thr1 t1 = new thr1();
        Thread master1 = new Thread(t1);
        thr2 t2 = new thr2();
        Thread master2 = new Thread(t2);

        master1.start();
        master2.start();

//        t1.run();
//        t2.run();
    }
}
