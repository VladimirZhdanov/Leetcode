package com.homel.leetcode.samples.numbers;

public class PalindromeNumber9 {

    public static void main(String[] args) {
        PalindromeNumber9 palindromeNumber = new PalindromeNumber9();
        System.out.println(palindromeNumber.isPalindrome(121));
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

    public boolean isPalindrome3(int x) {
        if (x < 0) return false;

        String input = "" + x;

        int l = 0;
        int r = input.length() - 1;

        while (l <= r) {
            if (input.charAt(l) == input.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }

        return true;
    }
}
