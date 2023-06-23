package com.homel.leetcode.samples.sort;

public class MergeSort {
    public static void mergeSort(int[] nums, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = nums[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = nums[i];
        }
        mergeSort(left, mid);
        mergeSort(right, n - mid);

        merge(nums, left, right, mid, n - mid);
    }

    public static void merge(int[] nums, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                nums[k++] = l[i++];
            }
            else {
                nums[k++] = r[j++];
            }
        }
        while (i < left) {
            nums[k++] = l[i++];
        }
        while (j < right) {
            nums[k++] = r[j++];
        }
    }
}
