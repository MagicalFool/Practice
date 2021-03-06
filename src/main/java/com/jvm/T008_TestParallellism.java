package com.jvm;

import java.util.ArrayList;
import java.util.List;

public class T008_TestParallellism {

    static volatile List pigs = new ArrayList();
    static volatile int pigsEaten = 0;
    static final int ENOUGH_PIGS = 5000;

    public static void main(String[] args) {
        new PigDigester().start();
        new PigEater().start();
    }

    static class PigEater extends Thread{
        @Override
        public void run() {
            while (true){
                pigs.add(new byte[32 * 1024 * 1024]);
                if (pigsEaten > ENOUGH_PIGS) return;
                takeANap(100);
            }
        }
    }

    static class PigDigester extends Thread{
        @Override
        public void run() {
            long start = System.currentTimeMillis();
            while (true){
                takeANap(2000);
                pigsEaten += pigs.size();
                pigs = new ArrayList();
                if (pigsEaten > ENOUGH_PIGS){
                    System.out.format("Digested %d pigs in %d ms. %n",pigsEaten,System.currentTimeMillis() - start);
                }
            }
        }
    }

    static void takeANap(int ms){

        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
