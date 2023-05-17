class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class T4 {
    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return isBalancedHelper(root) != -1;
        }
    }

    private static int isBalancedHelper(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = isBalancedHelper(root.left);
            int rightHeight = isBalancedHelper(root.right);
            if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
                return -1;
            } else {
                return Math.max(leftHeight, rightHeight) + 1;
            }
        }
    }

    public static void main(String[] args) {
        // Construct a balanced binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Check if the tree is balanced
        boolean isBalanced = isBalanced(root);
        System.out.println("The tree is balanced: " + isBalanced);
    }
}
