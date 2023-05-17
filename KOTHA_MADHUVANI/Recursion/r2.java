public class r2 {
    public static void main(String[] args) {
        int m = 3;
        int n = 2;
        int uniquePaths = findUniquePaths(m, n);
        System.out.println(uniquePaths);
    }

    public static int findUniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        // Initialize the first row and column with 1 since there is only one way to
        // reach any cell in the first row or column
        for (int i = 0; i < m; i++)
            dp[i][0] = 1;
        for (int j = 0; j < n; j++)
            dp[0][j] = 1;

        // Calculate the number of unique paths for each cell
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        // Return the number of unique paths to the bottom-right cell
        return dp[m - 1][n - 1];
    }
}
