package com.homel.leetcode.samples.arrays;

public class CanPlaceFlowers605 {
    public static void main(String[] args) {
        canPlaceFlowers(new int[]{1,0,0,0,1}, 1);
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length;

        if (n == 1 && l == 1 && flowerbed[0] == 0) return true;
        if (n == 0 && l > 0) return true;
        if (l < 2) return false;
        
        int prev = 0;
        int next = 0;


        for (int i = 0; i < l - 1; i++) {
            next = flowerbed[i + 1];

            if (flowerbed[i] == 0 && next == 0 && flowerbed[i] == prev) {
                flowerbed[i] = 1;
                n--;
            }
            prev = flowerbed[i];
        }

        if (flowerbed[l - 1] == 0 && flowerbed[l - 2] == 0) {
            flowerbed[l - 1] = 1;
            n--;
        }

        return n <= 0;
    }
}
