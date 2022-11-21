package com.homel.leetcode.samples.strings;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWordsInString151 {

    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] array = s.split(" ");
        int j = array.length - 1;

        while (j >= 0) {
            if (!array[j].isEmpty()) {
                sb.append(array[j]);
                if (j != 0 && !array[j + 1].isEmpty()) sb.append(" ");
            }
            j--;
        }

        // remove useless
       // if (sb.charAt(sb.length() - 1) == ' ') sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}
