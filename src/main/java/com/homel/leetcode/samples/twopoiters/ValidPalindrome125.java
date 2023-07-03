package com.homel.leetcode.samples.twopoiters;

public class ValidPalindrome125 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        String input = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        System.out.println(swap(input));
        return input.equals(swap(input));
    }

    private static String swap(String s) {
        char[] result = new char[s.length()];

        int l = 0, r = result.length - 1;

        while (l <= r) {
            result[l] = s.charAt(r);
            result[r] = s.charAt(l);
            l++;
            r--;
        }

        return String.valueOf(result);
    }
}
