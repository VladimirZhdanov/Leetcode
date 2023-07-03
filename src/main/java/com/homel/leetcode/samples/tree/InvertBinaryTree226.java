package com.homel.leetcode.samples.tree;

public class InvertBinaryTree226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        if (root.left != null) invertTree(root.left);
        if (root.right != null) invertTree(root.right);

        return root;
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
