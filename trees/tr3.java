import java.util.*;

public class tr3 {
public TreeNode invertTree(TreeNode root) {
    if (root == null) {
        return null;
    }

    TreeNode temp = root.left;
    root.left = root.right;
    root.right = temp;
    invertTree(root.left);
    invertTree(root.right);

    return root;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the nodes of the binary tree (space-separated, -1 for null):");
    TreeNode root = constructBinaryTree(sc);

    tr3 solution = new tr3();
    TreeNode invertedRoot = solution.invertTree(root);

    System.out.println("Inverted binary tree:");
    printBinaryTree(invertedRoot);
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

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}