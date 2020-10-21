package com.jvm;

import java.util.HashMap;


/**
 *  jvm 参数 -Xmx512M -Xms512M -XX:+UseSerialGC -Xloggc:gc.log -XX:+PrintGCDetails
 * @author chenchao
 */
public class T009_StopTheWorldDemo {

    public static class MyThread extends  Thread{
        HashMap map = new HashMap();

        @Override
        public void run(){

            try {
                while (true){
                    if (map.size() * 512 / 1024 / 1024 >= 400){
                        map.clear();
                        System.out.println("clean map");
                    }

                    for (int i = 0; i < 100; i++) {
                        byte[] b1 = new byte[512]; // 模拟内存占用
                        map.put(System.nanoTime(),b1);
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static class PrintThread extends Thread{
        public final long starttime = System.currentTimeMillis();

        @Override
        public void run() {

            try {
                while (true){
                    long t = System.currentTimeMillis() - starttime;
                    System.out.println(t/1000 + "," + t % 1000);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        PrintThread printThread = new PrintThread();
        printThread.start();
    }
}
