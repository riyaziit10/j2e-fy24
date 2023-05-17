/*
Problem 1:

Given the roots of two binary trees p and q, write a function to check if they are the same or not.
Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.


EXAMPLE 1
Input: p = [1,2,3], q = [1,2,3]
Output: true


Example 2
Input: p = [1,2,1], q = [1,1,2]
Output: false


Example 3
Input: p = [1,2], q = [1,null,2]
Output: false

*/



import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}

public class Problem1 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("p = ");
        TreeNode p = constructBinaryTree(sc);
        System.out.println("q = ");
        TreeNode q = constructBinaryTree(sc);
        Problem1 sol = new Problem1();
        boolean result = sol.isSameTree(p, q);
        System.out.println(result);
    }

    private static TreeNode constructBinaryTree(Scanner sc) {
        String[] nodes = sc.nextLine().split(" ");
        TreeNode root = constructNode(nodes[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        for (int i = 1; i < nodes.length; i += 2) {
            TreeNode current = queue.poll();
            if (!nodes[i].equals("-1")) {
                current.left = constructNode(nodes[i]);
                queue.offer(current.left);
            }
            if (i + 1 < nodes.length && !nodes[i + 1].equals("-1")) {
                current.right = constructNode(nodes[i + 1]);
                queue.offer(current.right);
            }
        }
        return root;
    }

    private static TreeNode constructNode(String val) {
        if (val.equals("-1")) {
            return null;
        }
        return new TreeNode(Integer.parseInt(val));
    }
}


