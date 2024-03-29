package com.homel.leetcode.samples.search.slidingwindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ToSum1 {

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int[] result = twoSum(nums, 6);
        System.out.println(Arrays.toString(result)); // [1, 2]
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

         for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
         }

         return new int[]{0, 0};
    }
}
