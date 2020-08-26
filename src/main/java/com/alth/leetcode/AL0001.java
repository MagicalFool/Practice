package com.alth.leetcode;

/**
 * 给定一个整数数组 nums和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * 例如 nums = [1,2,4,5,6] target = 7
 * 返回
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author chenchao
 */
public class AL0001 {

    public static void main(String[] args) {
        int arr[] = {-1,-2,-3,-4,-5};
        int[] ints = new AL0001().twoSum(arr, -8);
        if (ints == null){
            return;
        }
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

        public int[] twoSum(int[] nums, int target) {
            // 拿 target - nums[i] = x
            // if x in nums[i - 1] 则存在
            int res[] = new int[2];
            for (int i = 0; i < nums.length; i++) {
                //    不应该要这个判断
//                if ( (target < 0 && target > nums[i]) || (target >=0 && target <nums[i])){
//                    continue;
//                }
                int x = target - nums[i];

                for (int j = i + 1; j < nums.length; j++) {
                    if (x == nums[j]) {
                        res[0] = i;
                        res[1] = j;
                        return res;
                    }
                }
            }
            return null;
        }
}
