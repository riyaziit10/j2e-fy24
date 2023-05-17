import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class g1 {
    public static void main(String[] args) {
        int[][] graph = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 7, 6 } };
        int longestPath = findLongestPath(graph);
        System.out.println("Longest path length: " + longestPath);
    }

    public static int findLongestPath(int[][] graph) {
        Map<Integer, List<Integer>> adjacencyList = new HashMap<>();
        for (int[] edge : graph) {
            int source = edge[0];
            int destination = edge[1];
            adjacencyList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
        }

        int[] longestPaths = new int[adjacencyList.size() + 1];
        for (int vertex = 1; vertex <= adjacencyList.size(); vertex++) {
            if (!adjacencyList.containsKey(vertex)) {
                longestPaths[vertex] = 0;
            } else {
                for (int nextVertex : adjacencyList.get(vertex)) {
                    longestPaths[nextVertex] = Math.max(longestPaths[nextVertex], longestPaths[vertex] + 1);
                }
            }
        }

        int maxPathLength = 0;
        for (int length : longestPaths) {
            maxPathLength = Math.max(maxPathLength, length);
        }

        return maxPathLength;
    }
}
