package com.datastruct.heap;

/**
 * 实现堆
 * @author chenchao
 */
public class QHeap {
    private HeapNode[] heapArray;
    private int maxSize;
    private int currentSize;

    public QHeap(int mx){
        maxSize = mx;
        currentSize = 0;
        heapArray = new HeapNode[maxSize];
    }

    public boolean isEmpty(){
        return currentSize == 0;
    }

    public boolean insert(int key){
        if (currentSize == maxSize){
            return false;
        }
        HeapNode newNode = new HeapNode(key);
        heapArray[currentSize] = newNode;

        return true;
    }

    private void trickleUp(int index){
        int parent = (index - 1)/2;
        HeapNode bottom = heapArray[index];
        while (index > 0 && heapArray[parent].getKey() < bottom.getKey() ){
            heapArray[index] = heapArray[parent];
            index = parent;
            parent = (parent -1)/2;
        }
        heapArray[index] = bottom;

    }

    private void trickleDown(int index){
        int largeChild;
        HeapNode top = heapArray[index];
        while (index < currentSize/2    ){
            int leftChild = 2 * index + 1;
            int rightChild = leftChild + 1;

            if (rightChild < currentSize && heapArray[leftChild].getKey() < heapArray[rightChild].getKey()){
                largeChild = rightChild;
            }else {
                largeChild = leftChild;
            }
            if (top.getKey() >= heapArray[largeChild].getKey()){
                break;
            }
            heapArray[index] = heapArray[largeChild];

            index = largeChild;
        }
        heapArray[index] = top;
    }
}
