/*Given a binary tree, determine if it is 
height-balanced
.
 
Example 1:
 
Input: root = [3,9,20,null,null,15,7]
Output: true
Example 2:
 
Input: root = [1,2,2,3,3,null,null,4,4]
Output: false
Example 3:
Input: root = []
Output: true
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
        {
            return true;
        }

        else  if(Math.abs(height(root.left)-height(root.right))>1)
             {
                 return false;
             }
        
        else
        {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }
    public int  height(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        else
        {
          
                 return 1+Math.max(height(root.left),height(root.right));
             
             
        }
    }
}

