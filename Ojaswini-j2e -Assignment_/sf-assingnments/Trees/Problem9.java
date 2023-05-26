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
public class Problem9 {

    int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null){
            return 0;
        }else if(root.val>low&&root.val>high){
            rangeSumBST(root.left,low,high);
        }else if(root.val<low && root.val<high){
            rangeSumBST(root.right,low,high);
        }else{
            rangeSumBST(root.left,low,high);
            sum+=root.val;
            rangeSumBST(root.right,low,high);
        }
        return sum;
        
    }
    
}
