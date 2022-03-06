package com.homel.leetcode.samples;

public class AddBinary {
    public String addBinary(String a, String b) {
        int result = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);

        return Integer.toBinaryString(result);
    }
}
