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
public class t7 {
    int count;
    int res;
    public int kthSmallest(TreeNode root, int k) {
        count=0;res=0;
        inorder(root,k);
        return res;

        
    }
    public void inorder(TreeNode root,int k){
        if(root==null){
            return ;
        }
        inorder(root.left,k);
        count++;
        if(count==k){
            res=root.val;
            return;
        }
        inorder(root.right,k);
        
    }
    
}
