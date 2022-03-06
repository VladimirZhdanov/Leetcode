package com.homel.leetcode.samples;

import java.util.Locale;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        String input = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase(Locale.ROOT);

        char[] chars = input.toCharArray();

        int left = 0; int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        String output = String.valueOf(chars);

        return input.equals(output);

    }
}
