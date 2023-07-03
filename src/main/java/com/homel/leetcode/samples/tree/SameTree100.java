package com.homel.leetcode.samples.tree;

import java.util.ArrayList;
import java.util.List;

public class SameTree100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        search(list1, p);
        search(list2, q);

        return list1.equals(list2);
    }
    void search(List<Integer> list, TreeNode p) {
        if (p != null) {
            list.add(p.val);

            search(list, p.left);
            search(list, p.right);
        } else {
            list.add(null);
        }

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
