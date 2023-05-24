import java.util.*;

public class MinimumSwaps{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int minSwaps = findMinimumSwaps(arr);
        System.out.println("Minimum number of swaps: " + minSwaps);

        scanner.close();
    }

    public static int findMinimumSwaps(int[] arr) {
        int n = arr.length;
        int minSwaps = 0;

        int[] indices = new int[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[indices[i]] > arr[indices[j]]) {
                    int temp = indices[i];
                    indices[i] = indices[j];
                    indices[j] = temp;
                }
            }
        }

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] || indices[i] == i) {
                continue;
            }

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = indices[j];
                cycleSize++;
            }

            minSwaps += cycleSize - 1;
        }

        return minSwaps;
    }
}
