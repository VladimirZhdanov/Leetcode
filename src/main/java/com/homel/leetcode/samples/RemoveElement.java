package com.homel.leetcode.samples;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {

    }

    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        for (int value : nums) {
            list.add(value);
        }

        while (list.contains(val)) {
            list.remove((Integer)val);
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return list.size();
    }

    public int removeElement2(int[] nums, int val) {
        int writePtr = 0;
        for (int readPtr=0; readPtr<nums.length; readPtr++){
            if(nums[readPtr] == val) continue;
            nums[writePtr++] = nums[readPtr];
        }
        return writePtr;
    }
}
