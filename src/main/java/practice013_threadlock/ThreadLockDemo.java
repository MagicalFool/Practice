package practice013_threadlock;

import java.util.HashMap;

class Res {
    private int count;
    ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public int get() {
        count = threadLocal.get() + 1;
        threadLocal.set(count);
        return count;
//        return count;
    }
}

public class ThreadLockDemo implements Runnable {

    Res res;

    public ThreadLockDemo(Res res) {
        this.res = res;
    }

    public Res getRes() {
        return res;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + ",count=" + res.get());
        }
    }

    public static void main(String[] args) {
        Res res = new Res();
        ThreadLockDemo lockDemo = new ThreadLockDemo(res);
        Thread t = new Thread(lockDemo);
        Thread t1 = new Thread(lockDemo);
        Thread t2 = new Thread(lockDemo);
        t.start();
        t1.start();
        t2.start();
    }
}
