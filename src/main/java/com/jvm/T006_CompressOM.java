package com.jvm;

import org.openjdk.jol.info.ClassLayout;

public class T006_CompressOM {
    public static void main(String[] args) {
        new T006_CompressOM().test(1);
//        System.out.printf(ClassLayout.parseInstance(T006_CompressOM.class).toPrintable());
    }

    public void test(int i) {
        i++;
        System.out.println(i);
        test(i);

    }
}
