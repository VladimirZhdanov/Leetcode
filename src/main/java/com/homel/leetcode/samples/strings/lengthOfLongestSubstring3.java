package com.homel.leetcode.samples.strings;

import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubstring3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int count = 0;

        while (j < s.length()) {
            if (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i++));
            } else {
                set.add(s.charAt(j++));
                count = Math.max(count, set.size());
            }
        }

        return count;
    }
}
