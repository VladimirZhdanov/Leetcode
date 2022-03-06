package com.homel.leetcode.samples;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestCity {
    public String destCity(List<List<String>> paths) {

        Map<String, String> map = new HashMap<>();
        paths.forEach(it -> map.put(it.get(0), it.get(1)));

        String temp = paths.get(0).get(0);

        while (map.containsKey(temp)) {
            temp = map.get(temp);
        }

        return temp;

    }
}
