package com.alth.huawei;

import java.util.Scanner;

/**
 * 正整数a和正整数b 的最小公倍数是指 能被a和b整除的最小的正整数值，设计一个算法，求输入a和b的最小公倍数。
 */
public class AL0001 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int j = scanner.nextInt();

        System.out.println(new AL0001().commonMultiple(i, j));
    }

    public long commonMultiple(int i, int j) {
        if (i <= 1 || j <= 1) {
            return i > j ? i : j;
        }
        int n = -1;
        for (int k = 1; k < Integer.MAX_VALUE; k++) {
            if (k % i == 0 && k % j == 0) {
                n = k;
                break;
            }
        }
        return n;
    }
}
