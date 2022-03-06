package com.homel.leetcode.samples;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        longestCommonPrefix(new String[]{"flower","flow","flight"});
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        int i = 0;

        while(true) {
            char temp = '0';
            for(String s: strs) {
                if(i == s.length()) return res.toString();
                if(temp == '0') temp = s.charAt(i);
                if(s.charAt(i) != temp) return res.toString();
            }
            res.append(temp);
            i++;
        }
    }
}
