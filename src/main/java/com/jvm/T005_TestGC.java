package com.jvm;

/**
 *x
 */
public class T005_TestGC {
    public static void test1(){
        byte[] a = new byte[6 * 1024 * 1024];
        System.gc();
        System.out.println("first explict gc over");
    }

    public static void main(String[] args) {
        T005_TestGC.test1();
    }
}
