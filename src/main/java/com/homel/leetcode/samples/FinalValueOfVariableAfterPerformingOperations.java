package com.homel.leetcode.samples;

import java.util.HashMap;
import java.util.Map;

public class FinalValueOfVariableAfterPerformingOperations {

    public int finalValueAfterOperations(String[] operations) {

        Map<String, Integer> map = new HashMap<>();
        map.put("X++", 1);
        map.put("++X", 1);
        map.put("X--", -1);
        map.put("--X", -1);

        int res = 0;

        for (String s : operations) {
            res = res + map.get(s);
        }

        return res;
    }


}
