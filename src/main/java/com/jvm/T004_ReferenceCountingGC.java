package com.jvm;

public class T004_ReferenceCountingGC {

    public Object instance = null;

    private static final int _1MB = 1024 * 1024;
    private byte[] bigSize = new byte[_1MB * 2];

    public static void testGC() {

        T004_ReferenceCountingGC objA = new T004_ReferenceCountingGC();
        T004_ReferenceCountingGC objB = new T004_ReferenceCountingGC();

        objA.instance = objB;
        objB.instance = objA;

        objA = null;

        objB = null;

        System.gc();
    }

    public static void main(String[] args) {
        while (true) {
            testGC();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
