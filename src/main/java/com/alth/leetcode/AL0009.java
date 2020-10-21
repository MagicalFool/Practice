package com.alth.leetcode;

/**
 * AL0009
 */

public class AL0009 {

    public static void main(String[] args) {

        System.out.println(new AL0009().isPalindrome(121));

    }

    public boolean isPalindrome(int x) {
        int temp = x;
        if (x < 0) {
            return false;
        }
        int n = 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            x = x / 10;
        }

        return n == temp;
    }

}
