package Threading.Synchronization;

class customer{
    int amount = 10000;
    synchronized void withdraw(int amount){
        System.out.println("going to withdraw.");
        if (this.amount<amount){
            System.out.println("less balance; waiting for deposit..." + "Remaining balance = " + this.amount);
        }

        try {
            wait();
        } catch (Exception ignored){
        }
        // now after the deposit method is done working, now its time to run withdraw thread again.
        this.amount = this.amount - amount;
        System.out.println("Withdrawal completed.");
        System.out.println("Remaining balance: " + this.amount);
    }

    synchronized void deposit(int amount){
        System.out.println("goint to deposit...");
        this.amount += amount;
        System.out.println("deposit compelted");

        try {
            notify();
        } catch (Exception ignored){
        }
    }

}

public class threadSync {
    public static void main(String[] args) {
        customer ankit = new customer();

        new Thread(){
            @Override
            public void run() {
                ankit.withdraw(15000);
            }
        }.start();


        new Thread(){
            @Override
            public void run() {
                ankit.deposit(10000);
            }
        }.start();
    }
}
