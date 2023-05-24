import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class MaximumPathSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the values of the tree nodes: ");
        String[] values = scanner.nextLine().split(" ");

        TreeNode root = buildTree(values);

        int maxPathSum = findMaxPathSum(root);
        System.out.println("Maximum Path Sum: " + maxPathSum);

        scanner.close();
    }

    private static TreeNode buildTree(String[] values) {
        if (values == null || values.length == 0 || values[0].equals("null")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(values[0]));

        int index = 1;
        int n = values.length;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty() && index < n) {
            TreeNode node = queue.poll();

            String value = values[index++];
            if (!value.equals("null")) {
                node.left = new TreeNode(Integer.parseInt(value));
                queue.offer(node.left);
            }

            if (index < n) {
                value = values[index++];
                if (!value.equals("null")) {
                    node.right = new TreeNode(Integer.parseInt(value));
                    queue.offer(node.right);
                }
            }
        }

        return root;
    }

    private static int findMaxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int[] maxPathSum = new int[]{Integer.MIN_VALUE};
        findMaxPathSumHelper(root, maxPathSum);

        return maxPathSum[0];
    }

    private static int findMaxPathSumHelper(TreeNode node, int[] maxPathSum) {
        if (node == null) {
            return 0;
        }

        int leftSum = Math.max(findMaxPathSumHelper(node.left, maxPathSum), 0);
        int rightSum = Math.max(findMaxPathSumHelper(node.right, maxPathSum), 0);

        int currentSum = node.val + leftSum + rightSum;
        maxPathSum[0] = Math.max(maxPathSum[0], currentSum);

        return node.val + Math.max(leftSum, rightSum);
    }
}
