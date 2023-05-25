import java.util.Arrays;

public class Graph2 {
    public static int minimumSwaps(int[] arr) {
        int n = arr.length;
        int swaps = 0;

        int[][] elements = new int[n][2];
        for (int i = 0; i < n; i++) {
            elements[i][0] = arr[i];
            elements[i][1] = i;
        }

        Arrays.sort(elements, (a, b) -> a[0] - b[0]);

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] || elements[i][1] == i) {
                continue;
            }

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = elements[j][1];
                cycleSize++;
            }

            swaps += cycleSize - 1;
        }

        return swaps;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 7};
        int result = minimumSwaps(arr);
        System.out.println(result); 
    }
}
