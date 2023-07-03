package com.homel.leetcode.samples.search.binarysearch;

public class BinarySearch704 {

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,3,5,9,12}, 9));
    }

    public static int search(int[] nums, int target) {
        return bs(nums, 0, nums.length - 1, target);
    }

    private static int bs(int[] nums, int i, int j, int target) {
        if (j >= i) {
            int mid = i + (j - i) / 2;

            if (nums[mid] == target) return mid;
            if (nums[mid] > target) return bs(nums, i, mid - 1, target);

            return bs(nums, mid + 1, j, target);
        }

        return -1;
    }
}
