public class g11 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 9, 9, 4 },
                { 6, 6, 8 },
                { 2, 1, 1 }
        };

        int longestPathLength = findLongestIncreasingPath(matrix);
        System.out.println("Length of the longest increasing path: " + longestPathLength);
    }

    public static int findLongestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int[][] memo = new int[m][n];
        int maxLength = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int length = dfs(matrix, i, j, memo);
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }

    private static int dfs(int[][] matrix, int i, int j, int[][] memo) {
        if (memo[i][j] != 0) {
            return memo[i][j];
        }

        int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
        int maxLength = 1;

        for (int[] dir : dirs) {
            int x = i + dir[0];
            int y = j + dir[1];

            if (x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length && matrix[x][y] > matrix[i][j]) {
                int length = 1 + dfs(matrix, x, y, memo);
                maxLength = Math.max(maxLength, length);
            }
        }

        memo[i][j] = maxLength;
        return maxLength;
    }
}
