package com.homel.leetcode.samples;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromSortedList {
    public static void main(String[] args) {
        ListNode listNode = deleteDuplicates2(new ListNode(1, new ListNode(1, new ListNode(1))));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode res = null;
        Set<Integer> set = new HashSet<>();

        while (head != null) {
            set.add(head.val);
            head = head.next;
        }

        ListNode temp = null;

        List<Integer> list = set.stream().sorted().collect(Collectors.toList());

        for (Integer item : list) {
            if (res == null) {
                res = new ListNode(item);
                temp = res;
            } else {
                res.next = new ListNode(item);
                res = res.next;
            }
        }

        return temp;
    }

    public static ListNode deleteDuplicates2(ListNode head) {
        if (head == null) return null;
        Set<Integer> set = new HashSet<>();
        ListNode temp = head;
        ListNode prev = null;

        while (head != null) {
            if (set.contains(head.val)) {
                prev.next = head.next;
            } else {
                set.add(head.val);
                prev = head;
            }
            head = head.next;
        }
        return temp;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

