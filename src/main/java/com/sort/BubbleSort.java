package com.sort;

public class BubbleSort implements SortAble<Integer> {
    @Override
    public Integer[] sort(Integer[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
        return arr;
    }


}
