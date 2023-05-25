class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Graph8 {
    private int maxSum;

    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        calculateMaxPathSum(root);
        return maxSum;
    }

    private int calculateMaxPathSum(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftSum = Math.max(calculateMaxPathSum(node.left), 0);
        int rightSum = Math.max(calculateMaxPathSum(node.right), 0);

        int currentPathSum = node.val + leftSum + rightSum;
        maxSum = Math.max(maxSum, currentPathSum);

        return node.val + Math.max(leftSum, rightSum);
    }
}
