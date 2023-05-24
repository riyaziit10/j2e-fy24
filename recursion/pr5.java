import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Solution {
    private Map<Integer, List<TreeNode>> memo = new HashMap<>();

    public List<TreeNode> allPossibleFBT(int n) {
        if (n % 2 == 0) {
            return new ArrayList<>();
        }

        if (n == 1) {
            return List.of(new TreeNode(0));
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        List<TreeNode> result = new ArrayList<>();

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

        memo.put(n, result);
        return result;
    }
}

public class pr5 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        List<TreeNode> result = solution.allPossibleFBT(n);
        for (TreeNode root : result) {
            printTree(root);
            System.out.println();
        }
    }
    public static void printTree(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.val + " ");
        printTree(node.left);
        printTree(node.right);
    }
}
