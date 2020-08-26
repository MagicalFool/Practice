package com.alth.leetcode;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 123 -> 321
 * -123 -> -321
 *
 * @author chenchao
 */
public class AL0005 {

    public static void main(String[] args) {
//        int reverse = Integer.reverse(123);
//        System.out.println(reverse);
        int reverse = new AL0005().reverse(-1234343333);
        System.out.println(reverse);
    }

    public int reverse(int x) {
        long n = 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            x = x / 10;
        }
        return (int) n == n ? (int) n : 0;
    }

}
