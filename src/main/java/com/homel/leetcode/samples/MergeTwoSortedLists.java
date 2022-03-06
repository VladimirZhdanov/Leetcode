package com.homel.leetcode.samples;

import java.util.LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class MergeTwoSortedLists {

    public static void main(String[] args) {
        mergeTwoLists(new ListNode(1, new ListNode(2)), new ListNode(3, new ListNode(4)));
        mergeTwoLists(null, new ListNode(0));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        LinkedList<Integer> list1 = makeLinkedList(l1);
        LinkedList<Integer> list2 = makeLinkedList(l2);

        int i = 0;
        int j = 0;
        ListNode result = null;
        ListNode temp = null;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                if (result == null) {
                    result = new ListNode(list1.get(i++));
                    temp = result;
                } else {
                    result.next = new ListNode(list1.get(i++));
                    result = result.next;
                }
            } else {
                if (result == null) {
                    result = new ListNode(list2.get(j++));
                    temp = result;
                } else {
                    result.next = new ListNode(list2.get(j++));
                    result = result.next;
                }
            }
        }

        while (i < list1.size()) {
            if (result == null) {
                result = new ListNode(list1.get(i++));
                temp = result;
            } else {
                result.next = new ListNode(list1.get(i++));
                result = result.next;
            }
        }

        while (j < list2.size()) {
            if (result == null) {
                result = new ListNode(list2.get(j++));
                temp = result;
            } else {
                result.next = new ListNode(list2.get(j++));
                result = result.next;
            }
        }

        return temp;
    }

    private static LinkedList<Integer> makeLinkedList(ListNode l1) {
        LinkedList<Integer> list = new LinkedList<>();
        while (l1 != null) {
            list.add(l1.val);
            l1 = l1.next;
        }
        return list;
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

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists2(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists2(l1, l2.next);
            return l2;
        }
    }
}