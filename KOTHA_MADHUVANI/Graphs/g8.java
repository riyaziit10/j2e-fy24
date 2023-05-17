public class g8 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static class MaxSum {
        int max;

        MaxSum() {
            this.max = Integer.MIN_VALUE;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int maxPathSum = findMaxPathSum(root);
        System.out.println("Maximum Path Sum: " + maxPathSum);
    }

    public static int findMaxPathSum(TreeNode root) {
        MaxSum maxSum = new MaxSum();
        findMaxPathSumHelper(root, maxSum);
        return maxSum.max;
    }

    private static int findMaxPathSumHelper(TreeNode node, MaxSum maxSum) {
        if (node == null) {
            return 0;
        }

        // Recursively compute the maximum path sums of the left and right subtrees
        int leftSum = Math.max(0, findMaxPathSumHelper(node.left, maxSum));
        int rightSum = Math.max(0, findMaxPathSumHelper(node.right, maxSum));

        // Update the maximum path sum if the current node's path sum is larger
        maxSum.max = Math.max(maxSum.max, node.val + leftSum + rightSum);

        // Return the maximum path sum from the current node to its parent
        return node.val + Math.max(leftSum, rightSum);
    }
}
