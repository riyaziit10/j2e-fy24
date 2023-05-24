import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}

public class sol5 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }      
        if (root2 == null) {
            return root1;
        }
        root1.val += root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("root1 = ");
        TreeNode p = constructBinaryTree(sc);
        System.out.println("root2 = ");
        TreeNode q = constructBinaryTree(sc);
        sol5 sol = new sol5();
        TreeNode result = sol.mergeTrees(p, q);
        printBinaryTree(result);
    }

    private static TreeNode constructBinaryTree(Scanner sc) {
        String[] nodes = sc.nextLine().split(" ");
        return constructNode(nodes, 0);
    }

    private static TreeNode constructNode(String[] nodes, int index) {
        if (index >= nodes.length || nodes[index].equals("-1")) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(nodes[index]));
        node.left = constructNode(nodes, 2 * index + 1);
        node.right = constructNode(nodes, 2 * index + 2);
        return node;
    }

    private static void printBinaryTree(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        System.out.println();
    }
}

