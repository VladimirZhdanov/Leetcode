package com.homel.leetcode.samples;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] result = twoSum2(new int[]{1, 2}, 3);
        Arrays.stream(result).forEach(System.out::println);

        result = twoSum2(new int[]{2,7,11,15}, 9);
        Arrays.stream(result).forEach(System.out::println);

        result = twoSum2(new int[]{3,2,4}, 6);
        Arrays.stream(result).forEach(System.out::println);
    }


    public static int[] twoSum(int[] nums, int target) {
        if (nums.length == 2 && Arrays.stream(nums).sum() == target) {
            return new int[]{0, 1};
        }

        for (int i = 0; i < nums.length; i++) {
           for (int j = 0; j < nums.length; j++) {
               if (i != j && nums[i] + nums[j] == target) {
                   return new int[]{i, j};
               }
           }
        }

        return new int[]{};
    }

    public static int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        if (nums.length == 2 && Arrays.stream(nums).sum() == target) {
            result[1] = 1;
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;

                return result;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
