package practice008_thread;

public class MainThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("t1");
        MyThread t2 = new MyThread("t2");

        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
        t2.start();
    }
}
