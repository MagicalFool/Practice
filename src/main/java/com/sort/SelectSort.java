package com.sort;

public class SelectSort implements SortAble<Integer> {
    @Override
    public Integer[] sort(Integer[] arr) {
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            swap(arr,min,i);
        }
        return arr;
    }
}
