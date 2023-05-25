import java.util.*;
class R5{
    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            data=val;
            left=null;
            right=null;
        }
    }
    Map<Integer, List<TreeNode>>hm= new HashMap();

    public List<TreeNode> allPossibleFBT(int n) {
        if (!hm.containsKey(n)) {
            List<TreeNode>res= new LinkedList();
            if (n==1) {
                res.add(new TreeNode(0));
            } else if (n% 2 == 1) {
                for (int x = 0; x <n; ++x) {
                    int y = n- 1-x;
                    for (TreeNode left: allPossibleFBT(x))
                        for (TreeNode right: allPossibleFBT(y)) {
                            TreeNode ans = new TreeNode(0);
                            ans.left = left;
                            ans.right = right;
                            res.add(ans);
                        }
                }
            }
            hm.put(n,res);
        }

        return hm.get(n);
    }
}