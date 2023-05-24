

import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { 
        val = x; 
    }
}

class sol8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] values = sc.nextLine().split(",");
        TreeNode root = buildTree(values, 0);
        sol8 p = new sol8();
        int maxPathSum = p.maxPathSum(root);
        System.out.println(maxPathSum);
        sc.close();
    }

    private static TreeNode buildTree(String[] values, int index) {
        if (index >= values.length || values[index].equals("null")) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(values[index]));
        node.left = buildTree(values, 2 * index + 1);
        node.right = buildTree(values, 2 * index + 2);
        return node;
    }
    int max_path_sum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max_path_sum;
    }

    private int helper(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left_sum = Math.max(helper(node.left), 0);
        int right_sum = Math.max(helper(node.right), 0);
        int path_sum = node.val + left_sum + right_sum;
        max_path_sum = Math.max(max_path_sum, path_sum);
        return node.val + Math.max(left_sum, right_sum);
    }
}