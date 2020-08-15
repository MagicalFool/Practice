package com.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * -XX:MaxPermSize=10m
 * -XX:PermSize=10m
 * -Xms10m
 * -Xmx10m
 * -XX:-UseGCOverheadLimit
 */
public class T005_StringOOM {
    public static void main(String[] args) {
        try {
            List<String> list = new ArrayList<String>();
            for (int i = 0; ; i++) {
                System.out.println(i);
                list.add(String.valueOf("String" + i++).intern());
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
