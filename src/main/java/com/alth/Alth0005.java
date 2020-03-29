package com.alth;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * abba  -> bb
 * abababa -> abababa
 */
public class Alth0005 {

    public static void main(String[] args) {
        System.out.println(new Alth0005().longestPalindrome("aaaaabbbbb"));
    }



    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        String str = "";
        for (int j = 0; j < length; j++) {
            for (int i = j; i < length; i++) {
                if (j > length -i){
                    break;
                }
                String temp = s.substring(j,length-i);
                if (chars[i] == chars[length - i -1] && str.length() <= temp.length()){
                    str = temp;
                }

            }
        }

        return str;
    }
}
