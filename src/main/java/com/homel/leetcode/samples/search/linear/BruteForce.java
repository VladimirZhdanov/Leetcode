package com.homel.leetcode.samples.search.linear;

public class BruteForce {


    public static int searchBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        return -1;
    }
}
