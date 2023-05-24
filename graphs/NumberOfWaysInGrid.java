import java.util.Scanner;

public class NumberOfWaysInGrid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] grid = new int[rows][columns];
        System.out.println("Enter the grid elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        int numOfWays = findNumberOfWays(grid);
        System.out.println("The number of ways to reach the bottom-right corner of the grid is: " + numOfWays);

        scanner.close();
    }

    private static int findNumberOfWays(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;

        int[][] numOfWays = new int[rows][columns];

        numOfWays[0][0] = grid[0][0];
        for (int i = 1; i < rows; i++) {
            numOfWays[i][0] = numOfWays[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < columns; j++) {
            numOfWays[0][j] = numOfWays[0][j - 1] + grid[0][j];
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                numOfWays[i][j] = Math.min(numOfWays[i - 1][j], numOfWays[i][j - 1]) + grid[i][j];
            }
        }
        return numOfWays[rows - 1][columns - 1];
    }
}
