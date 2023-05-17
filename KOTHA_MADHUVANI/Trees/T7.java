import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class T7 {
    public static int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;

        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }

            node = stack.pop();
            k--;
            if (k == 0) {
                return node.val;
            }
            node = node.right;
        }

        return -1;
    }

    public static void main(String[] args) {
        // Construct a binary search tree
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        // Find the kth smallest element
        int k = 3;
        int kthSmallest = kthSmallest(root, k);
        System.out.println("The " + k + "th smallest element is " + kthSmallest);
    }
}
