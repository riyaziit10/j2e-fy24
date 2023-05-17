class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class T5 {
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        } else if (root2 == null) {
            return root1;
        } else {
            TreeNode mergedNode = new TreeNode(root1.val + root2.val);
            mergedNode.left = mergeTrees(root1.left, root2.left);
            mergedNode.right = mergeTrees(root1.right, root2.right);
            return mergedNode;
        }
    }

    public static void main(String[] args) {
        // Construct the two binary trees to be merged
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(7);

        // Merge the two trees
        TreeNode mergedTree = mergeTrees(root1, root2);

        // Print the inorder traversal of the merged tree
        System.out.print("Inorder traversal of the merged tree: ");
        printInorder(mergedTree);
    }

    public static void printInorder(TreeNode node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.val + " ");
        printInorder(node.right);
    }
}
