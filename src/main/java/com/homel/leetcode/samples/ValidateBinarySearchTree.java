package com.homel.leetcode.samples;

public class ValidateBinarySearchTree {

    static TreeNode prev;

    public boolean isValidBST(TreeNode root) {
        prev = null;
        return helper(root);
    }

    public static boolean helper(TreeNode root) {
        if (root == null) return true;

        boolean left = helper(root.left);

        if (prev != null && prev.val >= root.val) return false;

        prev = root;

        boolean right = helper(root.right);

        return left && right;
    }



      public class TreeNode {
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
