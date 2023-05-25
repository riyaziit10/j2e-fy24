import java.util.*;
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] graph = new int[n][2];
        for(int i = 0; i < n; i++) {
            graph[i][0] = sc.nextInt();
            graph[i][1] = sc.nextInt();
        }
        int[] indegree = new int[n];
        for(int i = 0; i < n; i++) {
            indegree[graph[i][1]]++;
        }
        int[] dp = new int[n];
        for(int i = 0; i < n; i++) {
            if(indegree[i] == 0) {
                dp[i] = 1;
            }
        }
        for(int i = 0; i < n; i++) {
            if(indegree[i] == 0) {
                for(int j = 0; j < n; j++) {
                    if(graph[j][0] == i) {
                        dp[graph[j][1]] = Math.max(dp[graph[j][1]], dp[i] + 1);
                    }
                }
            }
        }
        int max = 0;
        for(int i = 0; i < n; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }

}
