package practice023_countdown;

import java.util.concurrent.CountDownLatch;

/**
 * @author chenchao
 */
public class DemoCountDown {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
                countDownLatch.countDown();
            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
                countDownLatch.countDown();
            }
        });

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
