package com.jvm;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class T003_DirectMemoryOOM {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {

        Field fields = Unsafe.class.getDeclaredFields()[0];

        fields.setAccessible(true);

        Unsafe unsafe = (Unsafe) fields.get(null);
        while (true) {
            unsafe.allocateMemory(_1MB);
        }
    }
}
