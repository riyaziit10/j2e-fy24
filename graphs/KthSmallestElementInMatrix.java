import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElementInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        int kthSmallest = findKthSmallest(matrix, k);
        System.out.println("The kth smallest element in the matrix is: " + kthSmallest);

        scanner.close();
    }

    private static int findKthSmallest(int[][] matrix, int k) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[] flattenedMatrix = new int[rows * columns];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                flattenedMatrix[index++] = matrix[i][j];
            }

        Arrays.sort(flattenedMatrix);

        return flattenedMatrix[k - 1];
    }
}
