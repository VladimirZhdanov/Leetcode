package com.homel.leetcode.samples;

public class StrStr {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();

        if (n == 0) return 0;
        if (n > h) return -1;

        int delta = h - n;

        for (int i = 0; i <= delta; i++) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
