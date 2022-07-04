package com.homel.leetcode.samples.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAnagrams49 {
    public static void main(String[] args) {
        GroupAnagrams49 groupAnagrams = new GroupAnagrams49();
        groupAnagrams.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});

        String[] array = "".split(" ");
        Stream.of(array).filter(it -> !it.equals(" ")).collect(Collectors.toList());
    }


    public List<List<String>> groupAnagrams(String[] strs) {
        return new ArrayList<>(Stream.of(strs).collect(Collectors.groupingBy(this::evaluateKey)).values());
    }

    private String evaluateKey(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
