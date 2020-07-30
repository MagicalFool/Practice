package com.datastruct.array;

import java.util.Arrays;
import java.util.List;

/**
 * @author chenchao
 */
public class ArrayApp {

    public static void main(String[] args) {
        Long[] arr = new Long[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (long)i;
        }

        List<Long> longs = Arrays.asList(arr);
        for (Long l:longs) {
            System.out.println(l);
        }
    }


}
