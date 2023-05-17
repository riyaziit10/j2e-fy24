/*
Problem 5:

Given an integer n, return a list of all possible full binary trees with n nodes. Each node of each tree in the answer must have
Node.val == 0.

Each element of the answer is the root node of one possible tree. You may return the final list of trees in any order.

A full binary tree is a binary tree where each node has exactly 0 or 2 children.


Example 1:
Input: n = 3
Output: [[0,0,0]]


Example 2:
Input: n = 7
Output: [[0,0,0,null,null,0,0,null,null,0,0],[0,0,0,null,null,0,0,0,0],[0,0,0,0,0,0,0]]


Constraints:
1 <= n <= 20
*/


import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<TreeNode> result = allPossibleFBT(n);
        for (TreeNode root : result) {
            printTree(root);
            System.out.println();
        }
        sc.close();
    }

    public static List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> result = new ArrayList<>();
        if (n == 1) {
            result.add(new TreeNode(0));
            return result;
        }
        for (int i = 1; i < n; i += 2) {
            List<TreeNode> leftSubtrees = allPossibleFBT(i);
            List<TreeNode> rightSubtrees = allPossibleFBT(n - i - 1);
            for (TreeNode left : leftSubtrees) {
                for (TreeNode right : rightSubtrees) {
                    TreeNode root = new TreeNode(0);
                    root.left = left;
                    root.right = right;
                    result.add(root);
                }
            }
        }
        return result;
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
