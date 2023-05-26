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

public class t8 {
    public TreeNode sortedArrayToBST(int[] nums) {
        int l = 0;
        int r = nums.length;
        return insertIntoBST(null,nums,l,r);
    }
    
    public TreeNode insertIntoBST(TreeNode root,int[] nums, int l,int r){
        
        if(l>=r){
            return null;
        }
        int mid = (l+r)/2;
        root = new TreeNode(nums[mid]);
        root.left = insertIntoBST(root.left,nums,l,mid);
        root.right = insertIntoBST(root.right,nums,mid+1,r);
        
        return root;
    }
    
}
