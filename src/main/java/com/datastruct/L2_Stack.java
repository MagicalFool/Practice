package com.datastruct;


import java.util.Stack;

public class L2_Stack {

    public static void main(String[] args) {
        Stack<Object> stack = new Stack<>();
        stack.push('x');
        stack.push('y');
        stack.push('z');
        stack.peek();

        System.out.println(stack.peek());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}
