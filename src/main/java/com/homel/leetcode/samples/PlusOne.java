package com.homel.leetcode.samples;

import java.math.BigInteger;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();

        for (int val : digits) {
            sb.append(val);
        }
        long intResult = Long.parseLong(sb.toString()) + 1L;

        String[] split = String.valueOf(intResult).split("");

        int[] result = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            result[i] = Integer.parseInt(split[i]);
        }

        return result;
    }

    public int[] plusOne2(int[] digits) {

        int length = digits.length;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 == 10) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
                return digits;
            }
        }

        int[] result = new int[length + 1];
        result[0] = 1;
        return result;
    }
}
