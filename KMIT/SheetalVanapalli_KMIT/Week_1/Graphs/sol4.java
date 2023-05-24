import java.util.*;
public class sol4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(numIslands(matrix));
        sc.close();
    }
    public static int numIslands(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int count = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 1) {
                    dfs(matrix, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    private static void dfs(int[][] matrix, int i, int j) {
        if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] != 1) {
            return;
        }
        matrix[i][j] = -1;
        dfs(matrix, i+1, j);
        dfs(matrix, i-1, j);
        dfs(matrix, i, j+1);
        dfs(matrix, i, j-1);
    }

}