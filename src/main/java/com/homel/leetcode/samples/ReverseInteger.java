package com.homel.leetcode.samples;

import java.util.Arrays;

public class ReverseInteger {

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();

        System.out.println(reverseInteger.reverse(-2147483648));
    }

    public int reverse(int x) {
        boolean negative = false;

        char[] split = String.valueOf(x).toCharArray();

        int left = 0;
        int right = split.length - 1;

        while (left < right) {
            if (split[left] == '-') {
                left++;
                negative = true;
            }

            swap(left, right, split);
            left++;
            right--;
        }

        long l = Long.parseLong(String.copyValueOf(split));

        if(l > Integer.MAX_VALUE){
            return 0;
        }

        if (negative) {
            long a = l * -1;
            if(a > Integer.MAX_VALUE){
                return 0;
            }
        }

        return (int)l;
    }

    private void swap(int left, int right, char[] result) {
        char temp = result[left];
        result[left] = result[right];
        result[right] = temp;
    }
}
