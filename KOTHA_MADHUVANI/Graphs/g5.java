import java.util.PriorityQueue;

public class g5 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 5, 9 },
                { 10, 11, 13 },
                { 12, 13, 15 }
        };
        int k = 8;

        int kthSmallest = findKthSmallest(matrix, k);
        System.out.println("Kth smallest element: " + kthSmallest);
    }

    public static int findKthSmallest(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Create a min-heap using PriorityQueue to store the elements in the matrix
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add all elements from the matrix to the min-heap
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                minHeap.offer(matrix[i][j]);
            }
        }

        // Remove the smallest k-1 elements from the min-heap
        for (int i = 0; i < k - 1; i++) {
            minHeap.poll();
        }

        // The kth smallest element will be at the top of the min-heap
        return minHeap.peek();
    }
}
