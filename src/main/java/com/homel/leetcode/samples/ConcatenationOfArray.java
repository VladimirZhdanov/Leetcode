package com.homel.leetcode.samples;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        getConcatenation(new int[]{1, 2, 1});
    }

    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            result[j] = nums[i];
            j++;
            if (i + 1 == nums.length && j != result.length) i = -1;
        }
        return result;
    }
}
