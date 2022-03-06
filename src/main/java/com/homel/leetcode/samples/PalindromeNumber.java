package com.homel.leetcode.samples;

public class PalindromeNumber {

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(11212));
    }

    public boolean isPalindrome(int x) {
        int input = x;
        int temp;
        int sum = 0;

        while (x > 0) {
            temp = x % 10;
            sum = (sum * 10) + temp;
            x = x / 10;
        }

        return sum == input;
    }

    public boolean isPalindrome2(int x) {
        char[] chars = String.valueOf(x).toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] == '-') return false;

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left ++;
            right--;
        }

        return (int)Long.parseLong(String.copyValueOf(chars)) == x;
    }
}
