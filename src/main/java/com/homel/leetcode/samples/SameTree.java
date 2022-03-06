package com.homel.leetcode.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SameTree {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {

            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            search(list1, p);
            search(list2, q);

            return list1.equals(list2);
        }

        private void search(List<Integer> list, TreeNode node) {
            if (node == null) {
                list.add(null);
            } else {
                list.add(node.val);
                search(list, node.right);
                search(list, node.left);
            }
        }
    }
}
