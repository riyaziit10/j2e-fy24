public class Graph11 {
    private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int[][] memo = new int[m][n];
        int longestPath = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                longestPath = Math.max(longestPath, dfs(matrix, i, j, memo));
            }
        }

        return longestPath;
    }

    private int dfs(int[][] matrix, int i, int j, int[][] memo) {
        if (memo[i][j] != 0) {
            return memo[i][j];
        }

        int maxLength = 1;
        for (int[] direction : DIRECTIONS) {
            int newRow = i + direction[0];
            int newCol = j + direction[1];

            if (newRow >= 0 && newRow < matrix.length && newCol >= 0 && newCol < matrix[0].length
                    && matrix[newRow][newCol] > matrix[i][j]) {
                maxLength = Math.max(maxLength, 1 + dfs(matrix, newRow, newCol, memo));
            }
        }

        memo[i][j] = maxLength;
        return maxLength;
    }
}
