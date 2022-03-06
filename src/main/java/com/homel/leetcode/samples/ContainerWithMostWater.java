package com.homel.leetcode.samples;

public class ContainerWithMostWater {

    public int maxArea(int[] a) {
        int n = a.length;
        int ans = 0;

        int i = 0, j = n - 1; //i=leftpointer j=rightpointer
        while (i < j) {
            int area = (j - i) * Math.min(a[i], a[j]);
            ans = Math.max(ans, area);
            if (a[i] < a[j]) {
                i++;
            } else {
                j--;
            }

        }

        return ans;
    }
}
