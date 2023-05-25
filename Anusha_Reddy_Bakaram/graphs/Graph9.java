import java.util.ArrayList;
import java.util.List;

public class Graph9 {
    public int countPaths(int[][] graph, int source, int destination) {
        List<List<Integer>> adjacencyList = buildAdjacencyList(graph);
        int[] memo = new int[graph.length];
        return dfs(adjacencyList, source, destination, memo);
    }

    private List<List<Integer>> buildAdjacencyList(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> adjacencyList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for (int[] edge : graph) {
            int u = edge[0];
            int v = edge[1];
            adjacencyList.get(u).add(v);
        }

        return adjacencyList;
    }

    private int dfs(List<List<Integer>> adjacencyList, int source, int destination, int[] memo) {
        if (source == destination) {
            return 1;
        }

        if (memo[source] != 0) {
            return memo[source];
        }

        int count = 0;
        for (int neighbor : adjacencyList.get(source)) {
            count += dfs(adjacencyList, neighbor, destination, memo);
        }

        memo[source] = count;
        return count;
    }
}
