/*
5. Given an integer n, return a list of all possible full binary trees with n nodes. Each node of
each tree in the answer must have Node.val == 0. Each element of the answer is the root node
of one possible tree. You may return the final list of trees in any order. A full binary tree is a
binary tree where each node has exactly 0 or 2 children.
*/
class Solution {
public List<TreeNode> allPossibleFBT(int n) {
if (n % 2 == 0) {
return new ArrayList<TreeNode>();
}
if (n == 1) {
List<TreeNode> result = new ArrayList<>();
result.add(new TreeNode(0));
return result;
}
List<TreeNode> result = new ArrayList<>();
for (int i = 1; i < n; i += 2) {
List<TreeNode> leftSubtrees = allPossibleFBT(i);
List<TreeNode> rightSubtrees = allPossibleFBT(n - i - 1);
for (TreeNode left : leftSubtrees) {
for (TreeNode right : rightSubtrees) {
TreeNode root = new TreeNode(0);
root.left = left;
root.right = right;
result.add(root);
}
}
}
return result;
}
}