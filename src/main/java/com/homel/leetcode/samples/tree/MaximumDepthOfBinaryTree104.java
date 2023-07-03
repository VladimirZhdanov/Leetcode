package com.homel.leetcode.samples.tree;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumDepthOfBinaryTree104 {
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static int maxDepth2(TreeNode root) {
        if (root == null) return 0;

        Deque<TreeNode> deque = new LinkedList<>();

        int lvl = 0;

        deque.push(root);

        while (!deque.isEmpty()) {

            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pop();
                if (node.left != null) deque.addLast(node.left);
                if (node.right != null) deque.addLast(node.right);
            }
            lvl++;
        }

        return lvl;
    }
    
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
