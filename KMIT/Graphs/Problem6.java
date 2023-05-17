/*
Problem 6:

Implement a function to find the number of ways to reach the bottom-right corner of a m x n grid from the top-left
corner, where each cell contains a non-negative integer representing the cost to traverse it. You can only move
down or right at each step.


Example:
Input:
grid = [[1,3,1],
[1,5,1],
[4,2,1]]
Output:
6

*/


import java.util.*;
public class Problem6 { 
    private static int dfs(int[][] grid, int i, int j, int m, int n, int[][] graph) {
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        if (graph[i][j] != -1) {
            return graph[i][j];
        }
        int ways = 0;
        if (i + 1 < m) {
            ways += dfs(grid, i + 1, j, m, n, graph);
        }
        if (j + 1 < n) {
            ways += dfs(grid, i, j + 1, m, n, graph);
        }
        graph[i][j] = ways;
        return ways;
    }  
    public static int numWays(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] graph = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(graph[i], -1);
        }
        return dfs(grid, 0, 0, m, n, graph);
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println(numWays(grid));
        sc.close();
    }
}
