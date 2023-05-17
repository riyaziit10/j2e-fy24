import java.util.*;

public class g10 {
    public static void main(String[] args) {
        int n = 5;
        int[][] edges = { { 0, 1 }, { 1, 2 }, { 3, 4 } };

        int componentCount = countComponents(n, edges);
        System.out.println("Number of connected components: " + componentCount);
    }

    public static int countComponents(int n, int[][] edges) {
        // Create an adjacency list to represent the undirected graph
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        // Populate the adjacency list based on the given edges
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
        int componentCount = 0;

        // Traverse the graph and count the number of connected components
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(adjList, i, visited);
                componentCount++;
            }
        }

        return componentCount;
    }

    private static void dfs(List<List<Integer>> adjList, int node, boolean[] visited) {
        visited[node] = true;

        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                dfs(adjList, neighbor, visited);
            }
        }
    }
}
