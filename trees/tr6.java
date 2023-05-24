import java.util.Scanner;


class tr6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeNode root = createTree(scanner);

        boolean isValid = isValidBST(root);

        System.out.println("Is the tree a valid BST? " + isValid);
    }

    public static boolean isValidBST(TreeNode root) {
        return check(root, null, null);
    }

    public static boolean check(TreeNode root, Integer max, Integer min) {
        if (root == null) {
            return true;
        }
        if (max != null && root.val >= max) {
            return false;
        }
        if (min != null && root.val <= min) {
            return false;
        }
        return check(root.left, root.val, min) &&
                check(root.right, max, root.val);
    }

    public static TreeNode createTree(Scanner scanner) {
        System.out.println("Enter the value of the root node: ");
        int rootVal = scanner.nextInt();
        TreeNode root = new TreeNode(rootVal);

        System.out.println("Does the root node have a left child? (true/false)");
        boolean hasLeftChild = scanner.nextBoolean();
        if (hasLeftChild) {
            System.out.println("Enter the value of the left child: ");
            TreeNode leftChild = createTree(scanner);
            root.left = leftChild;
        }

        System.out.println("Does the root node have a right child? (true/false)");
        boolean hasRightChild = scanner.nextBoolean();
        if (hasRightChild) {
            System.out.println("Enter the value of the right child: ");
            TreeNode rightChild = createTree(scanner);
            root.right = rightChild;
        }

        return root;
    }
}
public class TreeNode {
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