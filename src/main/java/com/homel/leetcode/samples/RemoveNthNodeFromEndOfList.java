package com.homel.leetcode.samples;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode main = head;
        ListNode ref = head;
        int myN = n + 1;

        int count = 0;

        if (head != null) {
            while (count < myN) {
                if (ref == null) return head.next;
                ref = ref.next;
                count++;
            }

            if (ref == null) {
                main.next = main.next.next;
                return head;
            } else {
                while (ref != null) {
                    main = main.next;
                    ref = ref.next;
                }
                main.next = main.next.next;
                return head;
            }


        }
        return null;
    }

    static class ListNode {
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
