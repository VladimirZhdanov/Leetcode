package com.homel.leetcode.samples;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        List<String> strings = summaryRanges(new int[]{0, 1, 2, 4, 5, 7});
        System.out.println(strings);
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int j = i;
            String temp = nums[i]+"";
            while (i < nums.length - 1 && nums[i] == nums[i + 1] - 1) {
                i++;
            }
            if (i != j) {
                temp = temp + "->" + nums[i];
            }
            res.add(temp);
        }
        return res;
    }
}
