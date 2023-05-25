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
public class t6 {
    boolean flag = true;
    TreeNode previous = null;
    public void traverse(TreeNode root){
        if(root==null){
            return;
        }
        traverse(root.left);
        if(previous!=null && previous.val>=root.val){
            flag = false;
        }
        previous = root;
        traverse(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        traverse(root);
        return flag;
    }
    
}
