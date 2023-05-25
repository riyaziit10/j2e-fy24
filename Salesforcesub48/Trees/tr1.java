import java.util.*;

public class tr1 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nodes of the first binary tree (space-separated, -1 for null):");
        TreeNode p = constructBinaryTree(sc);
        System.out.println("Enter the nodes of the second binary tree (space-separated, -1 for null):");
        TreeNode q = constructBinaryTree(sc);
        tr1 solution = new tr1();
        boolean result = solution.isSameTree(p, q);
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
