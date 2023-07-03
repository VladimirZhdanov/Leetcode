package com.homel.leetcode.samples.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{7,1,5,3,6,4}));
        System.out.println(containsDuplicate(new int[]{7,1,5,3,6,7}));
    }


    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int value : nums) {
            if (set.contains(value)) {
                return true;
            } else {
                set.add(value);
            }
        }

        return false;
    }
}
