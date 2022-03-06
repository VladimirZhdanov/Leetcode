package com.homel.leetcode.samples;

public class ReverseLinkedList {
    public static void main(String[] args) {
        reverseList(new ListNode(1, new ListNode(2, new ListNode(3))));
    }

    public static ListNode reverseList(ListNode head) {
        ListNode temp = null;
        while (head != null) {
            ListNode next = head.next;

            head.next = temp;
            temp = head;
            head = next;
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

