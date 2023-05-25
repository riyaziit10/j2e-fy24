import java.util.ArrayList;
import java.util.List;

public class Graph10 {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adjacencyList = buildAdjacencyList(n, edges);
        boolean[] visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(adjacencyList, i, visited);
                count++;
            }
        }

        return count;
    }

    private List<List<Integer>> buildAdjacencyList(int n, int[][] edges) {
        List<List<Integer>> adjacencyList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjacencyList.get(u).add(v);
            adjacencyList.get(v).add(u);
        }

        return adjacencyList;
    }

    private void dfs(List<List<Integer>> adjacencyList, int node, boolean[] visited) {
        visited[node] = true;

        for (int neighbor : adjacencyList.get(node)) {
            if (!visited[neighbor]) {
                dfs(adjacencyList, neighbor, visited);
            }
        }
    }
}
