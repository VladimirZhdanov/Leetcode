package com.homel.leetcode.samples.strings;

public class ReverseString344 {

    public static void main(String[] args) {
        reverseString(new char[]{'H', 'e', 'l', 'l', 'o'});
    }

    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }

        for (char c : s) {
            System.out.println(c);
        }
    }
}
