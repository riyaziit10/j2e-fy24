import java.util.*;
public class sol5 {
    private static class Node {
        int val;
        int row;
        int col;
        public Node(int val, int row, int col) {
            this.val = val;
            this.row = row;
            this.col = col;
        }
    }
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
        int k = sc.nextInt();
        System.out.println(kthSmallest(matrix, k));
        sc.close();
    }

    private static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        boolean[][] visited = new boolean[n][n];
        PriorityQueue<Node> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
        minHeap.offer(new Node(matrix[0][0], 0, 0));
        visited[0][0] = true;
        for (int i = 0; i < k-1; i++) {
            Node node = minHeap.poll();
            if (node.row < n-1 && !visited[node.row+1][node.col]) {
                minHeap.offer(new Node(matrix[node.row+1][node.col], node.row+1, node.col));
                visited[node.row+1][node.col] = true;
            }
            if (node.col < n-1 && !visited[node.row][node.col+1]) {
                minHeap.offer(new Node(matrix[node.row][node.col+1], node.row, node.col+1));
                visited[node.row][node.col+1] = true;
            }
        }
        return minHeap.peek().val;
    }   
}