package com.alth;

import java.util.List;

/**
 * 实现从[1,2,3,5,6] 数组找出和为n的元素
 */
public class Alth0006 {

    public static void main(String[] args) {
        // 数组
        int[] arr = {1, 2, 3, 10, 11};

        //
        int n = 15;
        for (int i = 0; i < arr[i]; i++) {
            int s = n - arr[i];
            if (s < 0) {
                continue;
            } else if (s == 0) {
                // TODO 添加
            } else {
                // 递归剩下的数组 直到s == 0;
                int x = i + 1;

            }
        }
    }

    private static void get(int s, int x, int[] arr, List<Integer> list) {
        while (x != arr.length && s != 0) {
            s = s - arr[x++];
        }
    }


}
