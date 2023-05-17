import java.util.*;

public class g2 {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 6, 7 };
        int swaps = findMinimumSwaps(arr);
        System.out.println("Minimum number of swaps: " + swaps);
    }

    public static int findMinimumSwaps(int[] arr) {
        int n = arr.length;
        int swaps = 0;

        // Create an array of pairs to store the element and its original position
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = arr[i];
            pairs[i][1] = i;
        }

        // Sort the pairs array based on the element values
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));

        // Create a visited array to keep track of visited elements
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            // If the element is already visited or it is in its correct position
            if (visited[i] || pairs[i][1] == i)
                continue;

            int cycleSize = 0;
            int j = i;

            // Traverse the cycle and count its size
            while (!visited[j]) {
                visited[j] = true;
                j = pairs[j][1];
                cycleSize++;
            }

            // Update the number of swaps required
            swaps += (cycleSize - 1);
        }

        return swaps;
    }
}
