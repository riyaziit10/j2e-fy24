import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {
    }
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class sol7 {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> inorder = new ArrayList<>();
        inorderTraversal(root, inorder);
        return inorder.get(k - 1);
    }

    private void inorderTraversal(TreeNode node, List<Integer> inorder) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, inorder);
        inorder.add(node.val);
        inorderTraversal(node.right, inorder);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the binary search tree (space-separated, use 'null' for empty nodes):");
        String[] nodes = scanner.nextLine().split(" ");   
        TreeNode root = buildTree(nodes);
        System.out.println("Enter the value of k:");
        int k = scanner.nextInt();
        sol7 solution = new sol7();
        int result = solution.kthSmallest(root, k);
        System.out.println("Kth Smallest Element: " + result);
        scanner.close();
    }

    private static TreeNode buildTree(String[] nodes) {
        if (nodes.length == 0 || nodes[0].equals("null")) {
            return null;        
        }
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (!queue.isEmpty() && i < nodes.length) {
            TreeNode node = queue.poll();
            if (!nodes[i].equals("null")) {
                node.left = new TreeNode(Integer.parseInt(nodes[i]));
                queue.offer(node.left);
            }
            i++;
            if (i < nodes.length && !nodes[i].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(nodes[i]));
                queue.offer(node.right);
            }
            i++;
        }
        return root;
    }
}
