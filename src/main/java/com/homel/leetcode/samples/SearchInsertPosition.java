package com.homel.leetcode.samples;

public class SearchInsertPosition {


    public int searchInsert(int[] nums, int target) {
        if (nums[0] > target) return 0;
        if (nums[nums.length - 1] < target) return nums.length;

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
           if (nums[i] < target && nums[i + 1] > target) return i + 1;
           if (nums[i] == target) return i;
        }
        return -1;
    }
}
