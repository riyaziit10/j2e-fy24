class T2{
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
    public boolean isValid(TreeNode r1,TreeNode r2){
        if(r1==null && r2==null){
            return true;
        }
        if(r1==null || r2==null){
            return false;
        }
        if(r1.val!=r2.val){
            return false;
        }
        else{
        return isValid(r1.left,r2.right)&&isValid(r1.right,r2.left);
        }
    }
    public boolean isSymmetric(TreeNode root) {
      return  isValid(root.left,root.right);
    }
}
