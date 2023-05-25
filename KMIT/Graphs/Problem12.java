import java.util.*;
public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] dp = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 1; j <= nums[i]; j++) {
                if(i + j < n) {
                    dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
                }
            }
        }
        System.out.println(dp[n - 1]);
    }
}
