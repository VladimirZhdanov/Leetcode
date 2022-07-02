package com.homel.leetcode.samples.strings;

import java.util.Arrays;

public class ValidAnagram242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        char[] s_char = s.toCharArray();
        char[] t_char = t.toCharArray();
        Arrays.sort(s_char);
        Arrays.sort(t_char);

        String s1 = new String(s_char);
        String s2 = new String(t_char);
        return s1.equals(s2);
    }
}
