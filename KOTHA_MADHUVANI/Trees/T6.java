class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class T6 {
    public static boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    public static boolean isValidBST(TreeNode node, Integer lowerLimit, Integer upperLimit) {
        if (node == null) {
            return true;
        }
        int val = node.val;
        if (lowerLimit != null && val <= lowerLimit) {
            return false;
        }
        if (upperLimit != null && val >= upperLimit) {
            return false;
        }
        if (!isValidBST(node.left, lowerLimit, val)) {
            return false;
        }
        if (!isValidBST(node.right, val, upperLimit)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Construct a binary tree to be validated as BST
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);

        // Check if the binary tree is a valid BST
        boolean isValid = isValidBST(root);
        System.out.println("The binary tree is a valid BST: " + isValid);
    }
}
