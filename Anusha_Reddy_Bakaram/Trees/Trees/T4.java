class T4{
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int balanced(TreeNode root, boolean isbalanced) {
        if (root == null || !isbalanced) {
            return 0;
        }
        int leftheight = balanced(root.left, isbalanced);
        int rightheight = balanced(root.right, isbalanced);
        if (Math.abs(leftheight - rightheight) > 1) {
            isbalanced = false;
        }
        return 1 + Math.max(leftheight, rightheight);
    }
    
    public boolean isBalanced(TreeNode root) {
        boolean isbalanced = true;
        balanced(root, isbalanced);
        return isbalanced;
    }
}
