import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class sol5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<TreeNode> result = allPossibleFBT(n);
        for (TreeNode root : result) {
            printTree(root);
            System.out.println();
        }
        sc.close();
    }

    public static List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> result = new ArrayList<>();
        if (n == 1) {
            result.add(new TreeNode(0));
            return result;
        }
        for (int i = 1; i < n; i += 2) {
            List<TreeNode> leftSubtrees = allPossibleFBT(i);
            List<TreeNode> rightSubtrees = allPossibleFBT(n - i - 1);
            for (TreeNode left : leftSubtrees) {
                for (TreeNode right : rightSubtrees) {
                    TreeNode root = new TreeNode(0);
                    root.left = left;
                    root.right = right;
                    result.add(root);
                }
            }
        }
        return result;
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
}