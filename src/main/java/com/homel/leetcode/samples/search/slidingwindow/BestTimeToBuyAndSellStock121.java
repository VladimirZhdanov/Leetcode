package com.homel.leetcode.samples.search.slidingwindow;

public class BestTimeToBuyAndSellStock121 {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] prices) {
        int left = 0, right = 1;
        int maxProfit = 0;

        for (int i = 0; i < prices.length -1; i++) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                        maxProfit = Math.max(maxProfit, profit);
            } else {
                left = right;
            }
            right++;
        }

        return maxProfit;
    }
}
