package com.datastruct;

/**
 * Stack Abstract Data Interface
 * @author chenchao
 */
public interface StackInterface<T> {

    void push(T t);

    T pop();

    T peek();

    boolean isEmpty();

    void clear();


}
