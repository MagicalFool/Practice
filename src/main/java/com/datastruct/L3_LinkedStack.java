package com.datastruct;


import java.util.LinkedList;
import java.util.Vector;

/**
 * 链表实现的栈
 * @author chenchao
 */
public class L3_LinkedStack<T> implements StackInterface<T> {

    // References the first node in the chain
    private Node topNode;

    public L3_LinkedStack(){
        topNode = null;
    }

    private class Node{
        private T    data;  // Entry in stack
        private Node next;  // Link to next node

        Node(T data, Node fNode){
            this.data = data;
            this.next = fNode;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }


    @Override
    public void push(T t) {
        Node node = new Node(t,topNode);
        topNode = node;
    }

    @Override
    public T pop() {
        T top  = peek();
        assert topNode != null;
        topNode = topNode.getNext();
        return top;
    }

    @Override
    public T peek() {
        if (isEmpty()){
            throw new RuntimeException("Stack is null.");
        }else {
            return topNode.getData();
        }
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void clear() {
        topNode = null;
    }
}
