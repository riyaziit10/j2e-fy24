public class g6 {
    public static void main(String[] args) {
        int[][] grid = {
                { 1, 3, 1 },
                { 1, 5, 1 },
                { 4, 2, 1 }
        };

        int pathCount = countPaths(grid);
        System.out.println("Number of ways to reach the bottom-right corner: " + pathCount);
    }

    public static int countPaths(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Create a 2D dp array to store the number of ways to reach each cell
        int[][] dp = new int[rows][cols];

        // Initialize the first row and first column
        dp[0][0] = grid[0][0];

        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        for (int j = 1; j < cols; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        // Fill the dp array by considering the minimum cost path from the top-left to
        // each cell
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }

        // Return the number of ways to reach the bottom-right corner
        return dp[rows - 1][cols - 1];
    }
}
