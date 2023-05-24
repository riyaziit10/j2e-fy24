import java.util.*;



public class tr4 {
    public boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = height(root.left);
        int r = height(root.right);
        if (l == -1 || r == -1 || Math.abs(l - r) > 1) {
            return -1;
        }
        return 1 + Math.max(l, r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("root = ");
        TreeNode p = constructBinaryTree(sc);
        tr4 sol = new tr4();
        boolean result = sol.isBalanced(p);
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