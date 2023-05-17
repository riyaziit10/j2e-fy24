public class T10 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        if (root.val < val) {
            return searchBST(root.right, val);
        }
        return searchBST(root.left, val);
    }

    public static void main(String[] args) {
        // create a binary search tree
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int val = 2;

        T10 solution = new T10();
        TreeNode result = solution.searchBST(root, val);
        if (result == null) {
            System.out.println("Node with value " + val + " not found.");
        } else {
            System.out.println("Subtree rooted with node with value " + val + ": " + result.toString());
        }
    }
}
