import java.util.*;
public class Q5 {


public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> subsets = new ArrayList<>();
    backtrack(nums, 0, new ArrayList<>(), subsets);
    return subsets;
}

private void backtrack(int[] nums, int start, List<Integer> currentSubset, List<List<Integer>> subsets) {
    subsets.add(new ArrayList<>(currentSubset));

    for (int i = start; i < nums.length; i++) {
        currentSubset.add(nums[i]);
        backtrack(nums, i + 1, currentSubset, subsets);
        currentSubset.remove(currentSubset.size() - 1);
    }
}

}
