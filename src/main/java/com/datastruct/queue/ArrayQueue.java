package com.datastruct.queue;

/**
 * 数组实现队列
 * @author chenchao
 */
public class ArrayQueue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public ArrayQueue(int maxSize){
        this.maxSize = maxSize;
        queArray = new  long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    public void insert(long j){
        if (rear == maxSize -1){
            rear = -1;
            queArray[++rear] = j;
            nItems ++;
        }
    }
    public long remove(){
        long temp = queArray[front ++ ];
        if (front == maxSize){
            front = 0;
        }
        nItems --;
        return temp;
    }

    public long peekFront(){
        return queArray[front];
    }

    public boolean isEmpty(){
        return nItems == 0;
    }

    public boolean isFull(){
        return nItems == maxSize;
    }

    public int size(){
        return nItems;
    }
}
