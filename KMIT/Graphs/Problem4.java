import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++) {
            String s = sc.next();
            for(int j = 0; j < n; j++) {
                matrix[i][j] = s.charAt(j) - '0';
            }
        }
        int[][] visited = new int[n][n];
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0;j < n; j++) {
                if(matrix[i][j] == 1 && visited[i][j] == 0) {
                    dfs(matrix, visited, i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void dfs(int[][] matrix, int[][] visited, int i, int j) {
        if(i < 0 || i >= matrix.length || j < 0 || j >= matrix.length || matrix[i][j] == 0 || visited[i][j] == 1) {
            return;
        }
        visited[i][j] = 1;
        dfs(matrix, visited, i + 1, j);
        dfs(matrix, visited, i - 1, j);
        dfs(matrix, visited, i, j + 1);
        dfs(matrix, visited, i, j - 1);
    }
}