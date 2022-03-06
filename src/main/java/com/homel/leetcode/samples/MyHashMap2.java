package com.homel.leetcode.samples;

public class MyHashMap2 {

    int maxSize = 100_000;
    Node[] map;

    /** Initialize your data structure here. */
    public MyHashMap2() {
        map = new Node[maxSize];
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        int index = getIndex(key);

        map[index] = new Node(key, value);
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index = getIndex(key);

        if (map[index] == null) {
            return -1;
        } else {
            return map[index].value;
        }
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index = getIndex(key);

        map[index] = null;
    }

    static class Node {
        int key;
        int value;

        Node (int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    int getIndex(Integer key) {
        return key.hashCode() % map.length;
    }

}
