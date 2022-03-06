package com.homel.leetcode.samples;

import java.util.Arrays;
import java.util.Optional;

public class SortingTheSentence {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }

    public static String sortSentence(String s) {

        String[] s1 = s.split(" ");
        String[] result = new String[s1.length];

        for (int i = 0; i < s1.length; i++) {
            String word = s1[i];
            int index = Integer.parseInt(String.valueOf(word.charAt(word.length() - 1))) - 1;
            result[index] = word.replace(String.valueOf(index + 1), "");
        }

        return Arrays.stream(result).reduce((a, b) -> a + " " + b).orElse("");
    }
}
