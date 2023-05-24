import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class tr9 {
    private static TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (val < root.val) {
            return searchBST(root.left, val);
        }
        return searchBST(root.right, val);
    }

    private static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    private static void printInorder(TreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.val + " ");
            printInorder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeNode root = null;
        System.out.print("Enter the number of elements in the BST: ");
        int n = scanner.nextInt();
        System.out.print("Enter the elements of the BST: ");
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            root = insert(root, val);
        }

        System.out.print("Enter the value to search for: ");
        int val = scanner.nextInt();

        TreeNode result = searchBST(root, val);
        System.out.print("Subtree rooted with the node having value " + val + ": ");
        printInorder(result);
    }
}
