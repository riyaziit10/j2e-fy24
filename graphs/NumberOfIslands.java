import java.util.Scanner;

public class NumberOfIslands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the matrix elements (0 or 1):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int numOfIslands = findNumberOfIslands(matrix);
        System.out.println("The number of islands in the matrix is: " + numOfIslands);

        scanner.close();
    }

    private static int findNumberOfIslands(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                    dfs(matrix, i, j);
                }
            }
        }

        return count;
    }

    private static void dfs(int[][] matrix, int i, int j) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        if (i < 0 || i >= rows || j < 0 || j >= columns || matrix[i][j] != 1) {
            return;
        }

        matrix[i][j] = -1;

        dfs(matrix, i - 1, j); // Up
        dfs(matrix, i + 1, j); // Down
        dfs(matrix, i, j - 1); // Left
        dfs(matrix, i, j + 1); // Right
    }
}
