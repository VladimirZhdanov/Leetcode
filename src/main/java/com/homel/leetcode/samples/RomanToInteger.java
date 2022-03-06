package com.homel.leetcode.samples;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }

    public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CD",400);
        map.put("CM",900);
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        int sum = 0;

        s = s + " ";
        char[] chars = s.toCharArray();
        char first;
        char second;
        for (int i = 0; i < chars.length - 1; i++) {
            first = chars[i];
            second = chars[i+1];

            String temp = first + "" + second;

            if (map.containsKey(temp)) {
                sum = sum + map.get(temp);
                i++;
            } else {
                sum = sum + map.get(first+"");
            }
        }
        return sum;
    }
}
