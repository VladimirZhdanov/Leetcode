package com.homel.leetcode.samples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        generateParenthesis(3);
    }

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>(8);
        generate(list, "", n, 0, 0);
        return list;
    }

    static void generate(List<String> list, String s, int n, int open, int closed) {
        System.out.println(s);
        if (closed == open && open == n) {
            list.add(s);
            return;
        }

        if (open < n) {
            generate(list, s+"(", n, open + 1, closed);
        }

        if (closed < open) {
            generate(list, s+")", n, open, closed + 1);
        }
    }
}
