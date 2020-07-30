package com.datastruct;

/**
 * 递归的操作
 * @author chenchao
 */
public class L4_Recursive {

    public static void main(String[] args) {
        count(10);
    }

    public static void count(int i){
        System.out.println(i);
        if (i > 1){
            count(i - 1);
        }
    }
}
