package com.homel.leetcode.samples;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int i = removeDuplicates(new int[]{1, 1, 2});
        System.out.println(i);
    }

    public static int removeDuplicates(int[] nums) {
        List<Integer> set = new ArrayList<>();

        for (int val : nums) {
            if (!set.contains(val)) set.add(val);
        }

        for (int i = 0; i < set.size(); i++) {
            nums[i] = set.get(i);
        }

        return set.size();
    }

    public static int removeDuplicates2(int[] nums) {
        int i = 0;
        int j = 0;
        int prev = -101;

        while (i < nums.length) {
            if (nums[i] != prev) {
                nums[j++] = nums[i];
            }
            prev = nums[i++];
        }

        return j;
    }
}
