public class Solution7 {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,list);

        if(k>list.size())
        return -1;

        return list.get(k-1);

    }
    public void inorder(TreeNode root, ArrayList<Integer> list)
    {

        if(root!=null)
        {
            inorder(root.left,list);
            list.add(root.val);
            inorder(root.right,list);
        }
    }
}
