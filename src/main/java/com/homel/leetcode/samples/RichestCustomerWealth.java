package com.homel.leetcode.samples;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        int temp = 0;

        for (int[] acc : accounts) {
            for (int val : acc) {
                temp = temp + val;
            }
            if (res < temp) {
                res = temp;
                temp = 0;
            } else {
                temp = 0;
            }
        }

        return res;
    }
}
