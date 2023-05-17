class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class T2 {
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return isSymmetricHelper(root.left, root.right);
        }
    }

    private static boolean isSymmetricHelper(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            return isSymmetricHelper(p.left, q.right) && isSymmetricHelper(p.right, q.left);
        }
    }

    public static void main(String[] args) {
        // Construct a symmetric binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        // Check if the tree is symmetric
        boolean isSymmetric = isSymmetric(root);
        System.out.println("The tree is symmetric: " + isSymmetric);
    }
}
