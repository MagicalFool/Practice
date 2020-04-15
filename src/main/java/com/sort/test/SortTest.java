package com.sort.test;

import com.sort.BubbleSort;
import com.sort.SelectSort;

public class SortTest {

    public static void main(String[] args) {
        Integer[] arr = {3,1,2,1,2};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        bubbleSort.display(arr);
        System.out.println("swap times is " + bubbleSort.count.SWAP_NUM);

        SelectSort selectSort = new SelectSort();
        selectSort.sort(arr);
        selectSort.display(arr);
        System.out.println("swap times is " + selectSort.count.SWAP_NUM);
    }
}
