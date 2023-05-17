import java.util.*;

public class g12 {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 1, 4 };

        int minSteps = findMinimumSteps(nums);
        System.out.println("Minimum number of steps: " + minSteps);
    }

    public static int findMinimumSteps(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            int maxSteps = nums[i];

            for (int j = 1; j <= maxSteps && i + j < n; j++) {
                dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
            }
        }

        return dp[n - 1];
    }
}
