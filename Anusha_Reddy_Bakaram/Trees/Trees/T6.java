class T6{
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
    public boolean isValid(TreeNode r,TreeNode max,TreeNode min){
        if(r==null){
            return true;
        }
        if(min!=null && r.val<=min.val){
            return false;
        }
        if(max!=null && r.val>=max.val){
            return false;
        }
        return isValid(r.left,r,min) && isValid(r.right,max,r);
        
    }
    
    
    
    public boolean isValidBST(TreeNode root) {
       return isValid(root,null,null);
        
    }
}