import java.util.ArrayList;
import java.util.List;

public class B5 {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(res, curr, nums, 0);
        return res;
    }

    private static void backtrack(List<List<Integer>> res, List<Integer> curr, int[] nums, int start) {
        res.add(new ArrayList<>(curr)); // add the current subset to the result list

        for (int i = start; i < nums.length; i++) {
            curr.add(nums[i]); // add the current element to the current subset
            backtrack(res, curr, nums, i + 1); // recursively generate subsets with remaining elements
            curr.remove(curr.size() - 1); // remove the current element from the current subset to backtrack
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3 };
        List<List<Integer>> res1 = subsets(nums1);
        System.out.println(res1);

        int[] nums2 = { 0 };
        List<List<Integer>> res2 = subsets(nums2);
        System.out.println(res2);
    }
}
