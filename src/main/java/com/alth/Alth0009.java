package com.alth;

import java.util.*;

public class Alth0009 {

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(arr);
        System.out.println(lists);
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arryList = new ArrayList();
        //
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0){
                        // 加入前检查下是否有这些元素了
                        boolean b = true;
                        for (int l = 0; l < arryList.size(); l++) {
                            List<Integer> temp = arryList.get(l);
                            Set<Integer> hashSet = new HashSet<>(temp);
                            if (hashSet.contains(nums[i]) && hashSet.contains(nums[j]) && hashSet.contains(nums[k])){
                                b = false;
                                break;
                            }
                        }
                        if (b){
                            arryList.add(Arrays.asList(nums[i],nums[j], nums[k]));
                        }
                    }
                }
            }
        }
        //

        return arryList;

    }
}
