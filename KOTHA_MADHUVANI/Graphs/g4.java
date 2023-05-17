public class g4 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 1, 1, 1, 0 },
                { 1, 1, 0, 1, 0 },
                { 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0 }
        };

        int islandCount = countIslands(matrix);
        System.out.println("Number of islands: " + islandCount);
    }

    public static int countIslands(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                    exploreIsland(matrix, i, j);
                }
            }
        }

        return count;
    }

    private static void exploreIsland(int[][] matrix, int row, int col) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (row < 0 || col < 0 || row >= rows || col >= cols || matrix[row][col] != 1) {
            return;
        }

        matrix[row][col] = -1; // Mark the cell as visited

        // Recursively explore neighboring cells
        exploreIsland(matrix, row - 1, col);
        exploreIsland(matrix, row + 1, col);
        exploreIsland(matrix, row, col - 1);
        exploreIsland(matrix, row, col + 1);
    }
}
