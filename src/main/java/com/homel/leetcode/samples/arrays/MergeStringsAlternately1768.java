package com.homel.leetcode.samples.arrays;

public class MergeStringsAlternately1768 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int length1 = word1.length();
        int length2 = word2.length();

        int i = 0;
        int j = 0;

        while (i < length1 && j < length2) {
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        while (i < length1) {
            sb.append(word1.charAt(i++));
        }
        while (j < length2) {
            sb.append(word2.charAt(j++));
        }

        return sb.toString();
    }
}
