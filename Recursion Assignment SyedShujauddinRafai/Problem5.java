import java.util.*;
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<TreeNode> ans = allPossibleFBT(n);
        for(TreeNode root : ans) {
            print(root);
            System.out.println();
        }
    }
    public static ArrayList<TreeNode> allPossibleFBT(int n) {
        if(n == 1) {
            ArrayList<TreeNode> ans = new ArrayList<>();
            ans.add(new TreeNode(0));
            return ans;
        }
        ArrayList<TreeNode> ans = new ArrayList<>();
        for(int i = 1; i < n; i += 2) {
            ArrayList<TreeNode> left = allPossibleFBT(i);
            ArrayList<TreeNode> right = allPossibleFBT(n - i - 1);
            for(TreeNode l : left) {
                for(TreeNode r : right) {
                    TreeNode root = new TreeNode(0);
                    root.left = l;
                    root.right = r;
                    ans.add(root);
                }
            }
        }
        return ans;
    }
    public static void print(TreeNode root) {
        if(root == null) {
            return;
        }
        System.out.print(root.val + " ");
        print(root.left);
        print(root.right);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
