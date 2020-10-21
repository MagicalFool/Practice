package com.alth.leetcode;

/**
 * 动态规划 有一座高度是10级台阶的楼梯，从下往上走，每跨一步只能向上1级或者2级台阶。要求用程序来求出一共有多少种走法。
 * 汉诺塔问题
 * f(1) 1
 * f(2) 1
 * f(3) 2
 * f(3) 4
 */
public class AL0007 {
    public static void main(String[] args) {
        System.out.println(new AL0007().numWays2(44));
    }

    public int numWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return numWays(n - 1) + numWays(n - 2);

    }

    public int numWays2(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        long a = 1;
        long b = 2;
        long temp = 0;

        for (int i = 3; i <= n; i++) {
            temp = (a + b) % 1000000007;
            a = b;
            b = temp;
        }
        if (temp >= Integer.MAX_VALUE) {
            return -1;
        } else {
            return (int) temp;
        }


    }
}
