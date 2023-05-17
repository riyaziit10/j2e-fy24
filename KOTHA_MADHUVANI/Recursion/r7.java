public class r7 {
    public static void main(String[] args) {
        int N = 3;
        int W = 4;
        int[] profit = { 1, 2, 3 };
        int[] weight = { 4, 5, 1 };
        int maxProfit = knapsack(N, W, profit, weight);
        System.out.println(maxProfit);
    }

    public static int knapsack(int N, int W, int[] profit, int[] weight) {
        int[][] dp = new int[N + 1][W + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= W; j++) {
                if (weight[i - 1] <= j) {
                    dp[i][j] = Math.max(profit[i - 1] + dp[i - 1][j - weight[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[N][W];
    }
}
