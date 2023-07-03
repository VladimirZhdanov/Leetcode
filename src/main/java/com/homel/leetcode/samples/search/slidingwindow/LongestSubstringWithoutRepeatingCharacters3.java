package com.homel.leetcode.samples.search.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("au"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;

        Set<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        int count = 0;

        while (r < s.length()) {
            if (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l++));
            } else {
                set.add(s.charAt(r++));
                count = Math.max(count, set.size());
            }
        }

        return count;
    }
}
