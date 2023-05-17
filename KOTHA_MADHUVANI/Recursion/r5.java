import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class r5 {
    public static void main(String[] args) {
        int n = 3;
        List<TreeNode> trees = generateFullBinaryTrees(n);
        for (TreeNode root : trees) {
            printTree(root);
            System.out.println();
        }
    }

    public static List<TreeNode> generateFullBinaryTrees(int n) {
        List<TreeNode> result = new ArrayList<>();

        // Base cases
        if (n == 1) {
            result.add(new TreeNode(0));
            return result;
        } else if (n % 2 == 0) {
            return result; // Full binary tree cannot have an even number of nodes
        }

        for (int i = 1; i < n; i += 2) {
            List<TreeNode> leftSubtrees = generateFullBinaryTrees(i);
            List<TreeNode> rightSubtrees = generateFullBinaryTrees(n - i - 1);

            // Construct trees using combinations of left and right subtrees
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
            System.out.print("null ");
            return;
        }

        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
}
