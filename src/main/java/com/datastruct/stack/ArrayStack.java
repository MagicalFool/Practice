package com.datastruct.stack;

import java.util.Arrays;

/**
 * 数组实现栈
 *
 * @author chenchao
 */
public class ArrayStack {

    private int maxSize; // size of stack
    private Long[] stackArray; // storage of stack
    private int top;  // top of stack

    // init stack use constructor
    public ArrayStack(int size) {
        maxSize = size;
        stackArray = new Long[maxSize];
        top = -1;
    }

    // push data
    public void push(long i) {
        if (!isFull()) {
            stackArray[++top] = i;
        } else {
            throw new RuntimeException("Stack is Full!");
        }
    }

    // pop data
    public long pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            throw new RuntimeException("Stack is Empty!");
        }
    }

    // return  peek at top of stack
    public long peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            throw new RuntimeException("Stack is Empty!");
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == (maxSize - 1);
    }
}
