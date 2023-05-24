import java.util.*;
public class pr4 {
    public static int fun(int N, int V, int[] a) {
        int INF = Integer.MAX_VALUE;
        int[][] dp = new int[N+1][V+1];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], INF);
        }
        dp[0][V] = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= V; j++) {
                if (j >= a[i-1]) {
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][j-a[i-1]]);
                }
                dp[i][j] = Math.min(dp[i][j], dp[i-1][j-1]);
            }
        }
        int ans = INF;
        for (int j = 0; j <= V; j++) {
            if (dp[N][j] >= 0) {
                ans = Math.min(ans, dp[N][j]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(fun(n,v,arr));
    }
}
