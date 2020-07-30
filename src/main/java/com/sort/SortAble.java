package com.sort;

public interface SortAble<T> {

    Count count = new Count();

    T[] sort(T[] array);

    default void display(T[] array) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if (i != array.length - 1) {
                builder.append(",");
            }
        }
        builder.append("]");
        String arrayStr = builder.toString();
        System.out.println(arrayStr);
    }

    default T[] swap(T[] arr, int i, int j) {
        count.SWAP_NUM++;
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}
