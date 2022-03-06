package com.homel.leetcode.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });
        List<int[]> arr = new ArrayList<>();

        arr.add(intervals[0]);
        int j = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (arr.get(j)[1] >= intervals[i][0]) {
                arr.get(j)[1] = Math.max(arr.get(j)[1], intervals[i][1]);
            } else {
                arr.add(intervals[i]);
                j++;
            }
        }
        int[][] temp = new int[arr.size()][2];
        intervals = arr.toArray(temp);

        return intervals;
    }
}
