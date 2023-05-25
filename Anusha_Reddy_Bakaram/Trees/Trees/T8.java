class T8 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode sorted(int[] nums, int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = si + (ei - si) / 2;
        TreeNode nptr = new TreeNode(nums[mid]);
        nptr.left = sorted(nums, si, mid - 1);
        nptr.right = sorted(nums, mid + 1, ei);
        return nptr;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return sorted(nums, 0, nums.length - 1);
    }
}
