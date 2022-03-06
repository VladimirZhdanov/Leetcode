package com.homel.leetcode.samples;

import java.util.*;

public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {
        char[] s = stones.toCharArray();
        char[] j = jewels.toCharArray();

        int sum = 0;

        for (char jewel : j) {
            for (char stone : s) {
                if (jewel == stone) sum++;
            }
        }
        return sum;
    }

    public int numJewelsInStones2(String jewels, String stones) {
        String[] s = stones.split("");
        Set<String> j = new HashSet<>(Arrays.asList(jewels.split("")));

        int sum = 0;

        for (String stone : s) {
            if (j.contains(stone)) sum++;
        }
        return sum;
    }

    public int numJewelsInStones3(String jewels, String stones) {
        int count = 0;
        HashSet hash = new HashSet<>();
        for(Character jw:jewels.toCharArray()){
            hash.add(jw);
        }
        for(Character stone:stones.toCharArray()){
            if(hash.contains(stone))
                count++;
        }
        return count;
    }
}
