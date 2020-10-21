package com.alth;

/**
 * 给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
 */
public class Alth0001 {

    public static void main(String[] args) {
        int[] arr = {-1, -2, -3, -4, -5};
        int target = -8;
        int[] arr1 = new Solution().twoSum(arr, target);
        System.out.println(arr1[0] + "," + arr1[1]);
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];

        int length = nums.length;

        // 思路 先找数组第一个如果大了就下一个，如果小用target-x= x2 x2去数组里寻找有哦没有
        for (int i = 0; i < length; i++) {
//            if(nums[i] > target)
//                continue;
            res[0] = i;
            for (int j = i + 1; j < length; j++) {
                int tmp = nums[i];
                if ((target - tmp) == nums[j]) {
                    res[1] = j;
                    return res;
                }
            }

        }

        return null;

    }
}
