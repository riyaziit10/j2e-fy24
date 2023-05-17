/*

Problem 9 : Range Sum of BST

Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes
with a value in the inclusive range [low, high].


Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
Output: 32


Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
Output: 23

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

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("root = ");
        String[] values = sc.nextLine().split(" ");
        TreeNode root = constructBST(values);
        System.out.print("low = ");
        int low = sc.nextInt();
        System.out.print("high = ");
        int high = sc.nextInt();
        int sum = rangeSumBST(root, low, high);
        System.out.println(sum);
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

    public static int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        }
        if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        }
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}
