public class Solution5 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return null;
        TreeNode node = new TreeNode();
        if (root1 != null) node.val += root1.val;
        if (root2 != null) node.val += root2.val;
        node.left = mergeTrees(root1 != null ? root1.left : null, root2 != null ? root2.left : null);
        node.right = mergeTrees(root1 != null ? root1.right : null,root2 != null ? root2.right : null);
        return node;
    }
}
