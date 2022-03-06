package com.homel.leetcode.samples;

import java.util.ArrayList;
import java.util.List;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public static void main(String[] args) {
        int[] ints = minOperations("001011");
        for (int val : ints) {
            System.out.println(val);
        }
    }

    public static int[] minOperations(String boxes) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < boxes.length(); i++){
            if(boxes.charAt(i) == '1')
                list.add(i);
        }

        int[] res = new int[boxes.length()];

        for (int i = 0; i<res.length; i++) {
            int sum = 0;
            for (Integer index : list) {
                sum += Math.abs(i - index);
            }
            res[i] = sum;
        }
        return res;
    }
}

//Input: boxes = "110"
//Output: [1,1,3]