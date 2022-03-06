package com.homel.leetcode.samples;

import java.util.*;

public class InsertDeleteGetRandomO {

    Set<Integer> bank = new HashSet<>();

    public InsertDeleteGetRandomO() {
    }

    public boolean insert(int val) {
        return bank.add(val);
    }

    public boolean remove(int val) {
        return bank.remove(val);
    }

    public int getRandom() {
        List<Integer> list = new ArrayList<>(bank);
        Random random = new Random();
        if (list.size() > 0) {
            return list.get(random.nextInt(list.size() - 1));
        } else {
            return -1;
        }
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */