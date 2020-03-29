package com.alth;

import java.util.*;

public class Alth0004 {

    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b = {3,4};
        System.out.println(new Solution4().findMedianSortedArrays(a, b));
    }
}

class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            list.add(nums2[i]);
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        int size = list.size();
        if (size > 1){
            return size % 2 == 0 ? (Double.valueOf(list.get((size - 1)/2)) + Double.valueOf(list.get((size - 1)/2 + 1))) /2 : list.get((size - 1)/2);
        }else {
            return list.get(0);
        }
    }

}