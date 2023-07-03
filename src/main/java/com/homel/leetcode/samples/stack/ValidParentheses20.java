package com.homel.leetcode.samples.stack;

import java.util.LinkedList;

public class ValidParentheses20 {
    public static void main(String[] args) {
        char x = '('; //40
        char y = ')'; //41
        x = '{';//123
         y = '}';//125
         x = '[';//91
         y = ']';//93

        System.out.println(isValid("{()}"));
        System.out.println(isValid("{(})"));
        System.out.println(isValid("]{()}["));
        System.out.println(isValid("}()"));
        System.out.println(isValid("[)(]"));
    }

    public static boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        char[] chars = s.toCharArray();

        for (char c : chars) {
            switch (c) {
                case '(', '[', '{' -> stack.push(c);
                case ')', ']', '}' -> {
                    if (stack.isEmpty()) return false;
                    int diff = c - stack.pop();
                    if (diff != 1 && diff != 2) return false;
                }
            }
        }
       return stack.isEmpty();
    }
}
