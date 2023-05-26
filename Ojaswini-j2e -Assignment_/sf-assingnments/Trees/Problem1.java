package Trees;
class TreeNode {
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
public class Problem1 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        else if(p == null || q == null) {
            return false;
        }
        
        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);
        
        return left && right && p.val == q.val;
        
    }
    
}
