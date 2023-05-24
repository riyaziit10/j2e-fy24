import java.util.*;
public class sol2 {
    static int[][] grid; 
   

    public static int countPaths(int i, int j, int n, int m) {
        if (i == m - 1 || j == n - 1) {
            return 1;
        }
        if (grid[i][j] > 0) {
            return grid[i][j];
        }
        int rightPaths = countPaths(i, j + 1, m, n);
        int downPaths = countPaths(i + 1, j, m, n);
        int numPaths = rightPaths + downPaths;
        grid[i][j] = numPaths;
        return numPaths;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        grid = new int[m][n]; 
        System.out.println(countPaths(0, 0, m, n));
        sc.close();
    }
}