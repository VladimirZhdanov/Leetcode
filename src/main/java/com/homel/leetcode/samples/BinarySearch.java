package com.homel.leetcode.samples;

public class BinarySearch {
    int bs(int arr[], int i, int j, int x) {
        if (j >= i) {
            int mid = i + (j - i) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return bs(arr, i, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return bs(arr, mid + 1, j, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }
}
