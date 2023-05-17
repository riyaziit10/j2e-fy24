/* 
Problem2:

Implement a function to find the minimum number of swaps required to sort an array using graph theory.


Example:
Input:
arr = [5,3,8,6,7]
Output:
2

*/


import java.util.*;

public class Problem2 {
    public static int minSwaps(int[] arr) {
        int n = arr.length;
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new int[]{arr[i], i});
        }
        Collections.sort(list, (a, b) -> Integer.compare(a[0], b[0]));
        boolean[] visited = new boolean[n];
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] || list.get(i)[1] == i) {
                continue;
            }
            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = list.get(j)[1];
                cycleSize++;
            }
            if (cycleSize > 0) {
                swaps += cycleSize - 1;
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minSwaps(arr));
        sc.close();
    }
}
