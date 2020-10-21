package com.alth.leetcode;

/**
 * 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
 * <p>
 * '.' 匹配任意单个字符
 * '*' 匹配零个或多个前面的那一个元素
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/regular-expression-matching
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
@Deprecated
public class AL0010 {

    public static void main(String[] args) {
        System.out.println("abc".contains("a"));
    }

    public boolean isMatch(String s, String p) {
        char[] chars = p.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '.') {
                // 判断 chars[0]--- i-1
                String substring = p.substring(0, i - 1);
                if (s.contains(substring)) {

                }

            } else if (chars[i] == '*') {

            }
        }
        return true;
    }
}
