package com.datastruct.stack;

/**
 * 测试栈 翻转数字
 *
 * @author chenchao
 */
public class TestStack {

    public static void main(String[] args) {
        String str = "1234567";
        System.out.println("翻转前:" + str);
        char[] chars = str.toCharArray();
        ArrayStack stack = new ArrayStack(chars.length);
        for (char c : chars) {
            stack.push(Long.valueOf(String.valueOf(c)));
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            builder.append(stack.pop());
        }
        System.out.println("翻转后:" + builder.toString());
    }

}
