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
public class t5 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null){
            return root2;
        }
         
        
          if(root2 == null){
              return root1;
          }
        
        TreeNode nroot = new  TreeNode(root1.val + root2.val);
        
        nroot.left = mergeTrees(root1.left,root2.left);
        nroot.right = mergeTrees(root1.right,root2.right);
    
      return nroot;
        
    }
    
}
