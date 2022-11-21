package com.homel.leetcode.samples.binarysearch;

public class SearchInRotatedSortedArray33 {
    public static void main(String[] args) {
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    public static int search(int[] nums, int target) {

        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) return mid;

            if (nums[i] <= nums[mid]) {
                if (target < nums[mid] && target >= nums[i]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            }

            if (nums[mid] <= nums[j]) {
                if (target > nums[mid] && target <= nums[j]) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }
        }
        return -1;
    }
}
