package com.homel.leetcode.samples;

import java.util.Arrays;

public class MyHashSet {

    int[] set;

    /** Initialize your data structure here. */
    public MyHashSet() {
        set = new int[10_000_000];
        Arrays.fill(set, -1);
    }

    public void add(int key) {
        set[key] = key;
    }

    public void remove(int key) {
        set[key] = -1;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return set[key] != -1;
    }
}
