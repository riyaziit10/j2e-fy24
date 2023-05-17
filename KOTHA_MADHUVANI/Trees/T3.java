class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class T3 {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        } else {
            TreeNode temp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(temp);
            return root;
        }
    }

    public static void main(String[] args) {
        // Construct a binary tree
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        // Invert the tree
        TreeNode invertedRoot = invertTree(root);

        // Print the values of the inverted tree
        System.out.println(invertedRoot.val);
        System.out.println(invertedRoot.left.val);
        System.out.println(invertedRoot.right.val);
        System.out.println(invertedRoot.left.left.val);
        System.out.println(invertedRoot.left.right.val);
        System.out.println(invertedRoot.right.left.val);
        System.out.println(invertedRoot.right.right.val);
    }
}
