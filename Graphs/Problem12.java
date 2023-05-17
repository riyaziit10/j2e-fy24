/*
Problem 12:

Implement a function to find the minimum number of steps required to reach the end of an array of non-negative
integers, where each element of the array represents the maximum number of steps that can be taken forward from
that position.


Example:
Input:
nums = [2,3,1,1,4]
Output:
2

*/


import java.util.*;
class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(minSteps(nums));
        sc.close();
    }
    public static int minSteps(int[] nums) {
        int n = nums.length;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= i + nums[i] && j < n; j++) {
                graph.get(i).add(j);
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        int[] steps = new int[n];
        queue.offer(0);
        visited[0] = true;
        steps[0] = 0;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            if (curr == n - 1) {
                return steps[curr];
            }
            for (int neighbor : graph.get(curr)) {
                if (!visited[neighbor]) {
                    queue.offer(neighbor);
                    visited[neighbor] = true;
                    steps[neighbor] = steps[curr] + 1;
                }
            }
        }
        return -1;
    }
}
