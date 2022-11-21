package com.homel.leetcode.samples.numbers;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber136 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumberMy(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return 0;
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums) {
            result ^= i;
        }
        return result;
    }
}
