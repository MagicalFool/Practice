package com.jvm;

/**
 * JVM 参数
 */

import java.awt.image.ReplicateScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class T002_RuntimeConstantPoolOOM {

    private static Object object;

    public static void main(String[] args) throws InterruptedException {


        while (true) {
            object = lock();
            Thread.sleep(10);
        }

//        List<String> list = new ArrayList<String>();
//        int i = 0;
//        while (true){
//            list.add(new String(i+"hello"));
//        }
    }

    private static int[] lock() {
        int[] arr = new int[1024 * 10];
        Object obj = new Object();
        obj.toString();
        return arr;
    }
}
