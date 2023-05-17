import java.util.*;

public class g14 {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 1, 2 };

        int minSwaps = findMinimumSwaps(nums);
        System.out.println("Minimum number of swaps: " + minSwaps);
    }

    public static int findMinimumSwaps(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }

        int n = nums.length;
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);

        Map<Integer, Integer> numIndexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            numIndexMap.put(sortedNums[i], i);
        }

        boolean[] visited = new boolean[n];
        int minSwaps = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int j = i;
                int cycleSize = 0;

                while (!visited[j]) {
                    visited[j] = true;
                    j = numIndexMap.get(nums[j]);
                    cycleSize++;
                }

                minSwaps += cycleSize - 1;
            }
        }

        return minSwaps;
    }
}
