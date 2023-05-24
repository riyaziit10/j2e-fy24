import java.util.*;

public class tr2 {
    public boolean isSameTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null || node1.val != node2.val) {
            return false;
        }
        return isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nodes of the first binary tree (space-separated, -1 for null):");
        TreeNode p = constructBinaryTree(sc);
       
        tr2 solution = new tr2();
        boolean result = solution.isSameTree(p);
        System.out.println(result);
    }

    private static TreeNode constructBinaryTree(Scanner sc) {
        String[] nodes = sc.nextLine().split(" ");
        TreeNode root = constructNode(nodes[0]);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        for (int i = 1; i < nodes.length; i += 2) {
            TreeNode current = queue.poll();

            if (!nodes[i].equals("-1")) {
                current.left = constructNode(nodes[i]);
                queue.offer(current.left);
            }

            if (i + 1 < nodes.length && !nodes[i + 1].equals("-1")) {
                current.right = constructNode(nodes[i + 1]);
                queue.offer(current.right);
            }
        }

        return root;
    }

    private static TreeNode constructNode(String val) {
        if (val.equals("-1")) {
            return null;
        }
        return new TreeNode(Integer.parseInt(val));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}