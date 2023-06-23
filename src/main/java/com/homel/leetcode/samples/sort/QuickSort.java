package com.homel.leetcode.samples.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 5, 1, 6, 8};
        quickSort(arr, 0, arr.length - 1);
        for (Integer val : arr) {
            System.out.println(val);
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0) return;
        if (low >= high) return;

        int middle = low + (high - low) / 2;
        int opora = array[middle];


        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) i++;
            while (array[j] > opora) j--;

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < i) quickSort(array, low, j);
        if (high > j) quickSort(array, i, high);
    }
}
