/*

Problem 10 : Search in a Binary Search Tree

You are given the root of a binary search tree (BST) and an integer val.
Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a
node does not exist, return null.


Input: root = [4,2,7,1,3], val = 2
Output: [2,1,3]

*/


import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] values = sc.nextLine().split(" ");
        TreeNode root = constructBST(values);
        int val = sc.nextInt();
        TreeNode node = searchBST(root, val);
        if (node == null) {
            System.out.println(-1);
        } else {
            printTree(node);
        }
        sc.close();
    }

    public static TreeNode constructBST(String[] values) {
        TreeNode root = null;
        for (String value : values) {
            root = insert(root, Integer.parseInt(value));
        }
        return root;
    }

    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (val < root.val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
}
