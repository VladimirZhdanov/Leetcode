package com.homel.leetcode.samples.search;

import java.util.*;

import static com.homel.leetcode.samples.search.binarysearch.BinarySearch704.search;
import static com.homel.leetcode.samples.search.linear.BruteForce.searchBruteForce;
import static com.homel.leetcode.samples.sort.QuickSort.quickSort;

public class BruteForceVsBinarySearch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1_00_000_000; i++) {
            list.add(i);
        }

        int[] input = list.stream().mapToInt(Integer::intValue).toArray();
        int[] copy = list.stream().mapToInt(Integer::intValue).toArray();

        long start = System.currentTimeMillis();
        System.out.println("Start quickSort");
        quickSort(input);
        System.out.printf("Stop quickSort, taken: %d%n", System.currentTimeMillis() - start);
        System.out.println("Start BinarySearch");
        start = System.currentTimeMillis();
        System.out.println(search(input, 9));
        System.out.printf("Stop BinarySearch, taken: %d%n", System.currentTimeMillis() - start);

        System.out.println("Start BruteForce");
        start = System.currentTimeMillis();
        System.out.println(searchBruteForce(copy, 99_999_999));
        System.out.printf("Stop BruteForce, taken: %d%n", System.currentTimeMillis() - start);
    }
}
