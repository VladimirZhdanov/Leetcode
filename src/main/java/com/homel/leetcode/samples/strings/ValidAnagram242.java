package com.homel.leetcode.samples.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

    // лучший вариант
    public static boolean isAnagram2(String s, String t) {
        char[] res = new char[26];

        for (char value : s.toCharArray()) {
            res[value - 'a']++;
        }

        for (char value : t.toCharArray()) {
            res[value - 'a']--;
        }

        for (char value : res) {
            if (value != 0) return false;
        }

        return true;
    }

    public static boolean isAnagram3(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for (char value : s.toCharArray()) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        for (char value : t.toCharArray()) {
            map.put(value, map.getOrDefault(value, 0) - 1);
        }

        for (Integer value : map.values()) {
            if (value != 0) return false;
        }

        return true;
    }
}
