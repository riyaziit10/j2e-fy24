import java.util.*;
public class Q4 {
    public int pills(int N, int V, int[] a) {
        int[] dp = new int[V + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[V] = 0;
    
        for (int i = 1; i <= N; i++) {
            for (int j = V; j >= a[i - 1]; j--) {
                if (dp[j - a[i - 1]] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], dp[j - a[i - 1]] + 1);
                }
            }
        }
    
        return dp[0] == Integer.MAX_VALUE ? -1 : dp[0];
    }
    
}
