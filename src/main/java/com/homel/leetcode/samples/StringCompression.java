package com.homel.leetcode.samples;

public class StringCompression {
    public int compress(char[] chars) {
        if (chars == null || chars.length == 0)
            return 0;

        StringBuilder sb = new StringBuilder(chars.length);

        int i = 0, j = 1;
        while (i < chars.length || j < chars.length) {

            if (j < chars.length && chars[i] == chars[j]) {
                j++;
            } else {
                if (j - i == 1) {
                    sb.append(chars[i]);
                } else {
                    sb.append(chars[i]).append(j - i);
                }
                i = j;
                j++;
            }
        }

        i = 0;
        while (i < sb.length()) {
            chars[i] = sb.charAt(i);
            i++;
        }

        return sb.length();
    }
}
