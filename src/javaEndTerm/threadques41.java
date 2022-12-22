package javaEndTerm;

class thread1 extends Thread {
    @Override
    public void run() {
        int num = 0;
        // creating for loop that prints even number from 1-9
        for (int i = 1; i < 9; i++) {
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }
}

class thread2 extends Thread{
    @Override
    public void run() {
        // creating for loop that prints odd number from 1-9
        for (int i = 1; i <= 9; i++) {
            if (i%2 != 0){
                System.out.println(i);
            }
        }
    }
}



public class threadques41 {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();

        t1.run();
        t2.run();

    }
}
