package com.homel.leetcode.samples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NonRepeatingElement {

    static int search1(int[] nums) {
        long startTime = System.currentTimeMillis();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && map.get(nums[i]) == i) {
                System.out.println("Time1: " + (System.currentTimeMillis() - startTime));
                return nums[i];
            }
            map.remove(nums[i]);
        }
        return -1;
    }

    static int search2(int[] arr) {
        long startTime = System.currentTimeMillis();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++)
                if (i != j && arr[i] == arr[j])
                    break;
            if (j == n) {
                System.out.println("Time2: " + (System.currentTimeMillis() - startTime));
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[1_000_000];
        Arrays.fill(arr, 1);
        arr[0] = 666;
        int n = search1(arr);
        System.out.println(n);
        n = search2(arr);
        System.out.println(n);
    }
}
