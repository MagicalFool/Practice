package practice009_runnable;

public class RunnableDemo implements Runnable {
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }

    public static void main(String[] args) {
        RunnableDemo t1 = new RunnableDemo();
        RunnableDemo t2 = new RunnableDemo();
        Thread tt1 = new Thread(t1);
        Thread tt2 = new Thread(t2);
        tt1.start();
        tt2.start();
    }
}
