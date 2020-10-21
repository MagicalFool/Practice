package com.sort;

public class InsertSort implements SortAble<Integer> {
    @Override
    public Integer[] sort(Integer[] arr) {
        int in, out;
        for (out = 1; out < arr.length; out++) {

            int temp = arr[out];
            in = out;
            while (in > 0 && arr[in - 1] >= temp) {
                arr[in] = arr[in - 1];
                --in;
            }
            arr[in] = temp;
        }
        return arr;
    }
}
