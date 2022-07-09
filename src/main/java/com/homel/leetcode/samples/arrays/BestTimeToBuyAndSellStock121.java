package com.homel.leetcode.samples.arrays;

public class BestTimeToBuyAndSellStock121 {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        int localProfit;

        for (int price : prices) {
            if (price < min) min = price; //7 1 5 3

            localProfit = price - min; // 0 0 4

            if (profit < localProfit) profit = localProfit; // 0 0 4
        }
        return profit;
    }
}
