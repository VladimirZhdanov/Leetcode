package com.homel.leetcode.samples.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequences187 {

    public static void main(String[] args) {
        System.out.println(findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
    }

    public static List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> res = new HashSet<>();

        for (int i = 0; i + 9 < s.length(); i++) {
            String sub = s.substring(i, i + 10);

            if (!seen.add(sub)) res.add(sub);
        }

        return new ArrayList<>(res);
    }
}
