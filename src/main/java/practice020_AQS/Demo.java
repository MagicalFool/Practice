package practice020_AQS;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class Demo {

    public static void main(String[] args) {
        AbstractQueuedSynchronizer aos = new AbstractQueuedSynchronizer() {
            @Override
            protected boolean tryAcquire(int arg) {
                return super.tryAcquire(arg);
            }
        };
    }
}
