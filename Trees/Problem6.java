/* 

Problem 6 : Validate Binary Search Tree

Given the root of a binary tree, determine if it is a valid binary search tree (BST).


Input: root = [2,1,3]
Output: true


Input: root = [5,1,4,null,null,3,6]
Output: false 

*/


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

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeNode root = createTree(scanner);
        boolean isValid = isValidBST(root);
        System.out.println(isValid);
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
