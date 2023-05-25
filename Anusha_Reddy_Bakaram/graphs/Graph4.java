public class Graph4 {
    public int countIslands(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int count = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                    dfs(matrix, i, j);
                }
            }
        }

        return count;
    }

    private void dfs(int[][] matrix, int row, int col) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (row < 0 || col < 0 || row >= rows || col >= cols || matrix[row][col] != 1) {
            return;
        }

        matrix[row][col] = -1; // Mark the visited cell

        // Perform depth-first search in all four directions
        dfs(matrix, row - 1, col); // Up
        dfs(matrix, row + 1, col); // Down
        dfs(matrix, row, col - 1); // Left
        dfs(matrix, row, col + 1); // Right
    }
}
