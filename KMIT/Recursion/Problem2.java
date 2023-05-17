/*
Problem 2:

Find the number of unique paths in a n X m grid, starting from [0,0] to [n-1,m-1], where movement is only allowed
either 1 cell down or 1 cell right at a time.


Example 1:
Input: m = 3, n = 2
Output: 3
Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom
1. Right -> Down -> Down
2. Down -> Down -> Right
3. Down -> Right -> Down


Example 2:
Input: m = 3, n = 1
Output: 1
Explanation: From the top-left corner, there is exactly 1 way to reach the bottom-righ
1. Right -> Right -> Right


Constraints:
1 <= m, n <= 100

*/


import java.util.*;
public class Problem2 {
    static int[][] grid; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        grid = new int[m][n]; 
        System.out.println(countPaths(0, 0, m, n));
        sc.close();
    }

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
}
