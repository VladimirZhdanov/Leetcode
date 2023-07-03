package com.homel.leetcode.samples.search.slidingwindow;

import java.util.Arrays;

public class PermutationInString567 {

    public static void main(String[] args) {
        System.out.println(checkInclusion("abc", "bbbca"));
    }

    public static boolean checkInclusion(String s1, String s2) {

        if (s1.equals(s2)) return true;
        char[] charsS1 = s1.toCharArray();
        Arrays.sort(charsS1);
        String sortedS1 = String.valueOf(charsS1);

        for (int i = 0; i < s2.length() - 1; i++) {
            if (i + s1.length() > s2.length()) break;
            String temp = s2.substring(i, i + s1.length());
            char[] charsS2 = temp.toCharArray();
            Arrays.sort(charsS2);
            String sortedS2 = String.valueOf(charsS2);

            if (sortedS1.equals(sortedS2)) {
                return true;
            }
        }

        return false;
    }

    private static String swap(String s) {
        char[] res = new char[s.length()];

        int l = 0, r = s.length() - 1;
        while (l <= r) {
            res[l] = s.charAt(r);
            res[r] = s.charAt(l);
            l++;
            r--;
        }

        return String.valueOf(res);
    }
}
