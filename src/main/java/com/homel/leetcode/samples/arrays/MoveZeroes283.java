package com.homel.leetcode.samples.arrays;

import java.util.Arrays;

public class MoveZeroes283 {

    public static void main(String[] args) {
        int[] ints = {0, 1, 4, 0, 2, 5};

        moveZeroes(ints);

        Arrays.stream(ints).forEach(it -> System.out.println(it));
    }

    public static void moveZeroes(int[] nums) {

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j++] = temp;
            }
        }
    }
}
