/*

Problem 6:

Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.


Example 1:
Input: nums = [1,1,2]
Output:
[[1,1,2],
[1,2,1],
[2,1,1]]


Example 2:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
*/


import java.util.*;
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(permuteUnique(nums));
        sc.close();
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);  // Sort the input array to handle duplicates
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(nums, visited, new ArrayList<>(), result);
        return result;
    }
    public static void backtrack(int[] nums, boolean[] visited, List<Integer> tempList, List<List<Integer>> result) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] || (i > 0 && nums[i] == nums[i-1] && !visited[i-1])) {
                continue;  // Skip over duplicates
            }
            visited[i] = true;
            tempList.add(nums[i]);
            backtrack(nums, visited, tempList, result);
            tempList.remove(tempList.size()-1);
            visited[i] = false;
        }
    }
}

