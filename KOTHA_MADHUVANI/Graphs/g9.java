import java.util.*;

public class g9 {
    public static void main(String[] args) {
        int[][] graph = {
                { 0, 1 },
                { 0, 2 },
                { 1, 2 },
                { 1, 3 },
                { 2, 3 }
        };
        int source = 0;
        int destination = 3;

        int pathCount = countPaths(graph, source, destination);
        System.out.println("Number of paths: " + pathCount);
    }

    public static int countPaths(int[][] graph, int source, int destination) {
        int n = graph.length;

        // Create an adjacency list to represent the DAG
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        // Populate the adjacency list based on the given graph
        for (int[] edge : graph) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
        }

        // Create a dp array to store the number of paths from the source to each node
        int[] dp = new int[n];

        // Initialize the number of paths from the source to the source node as 1
        dp[source] = 1;

        // Perform a topological sort to determine the order of traversal
        List<Integer> order = topologicalSort(adjList);

        // Traverse the graph in the topological order and compute the number of paths
        for (int node : order) {
            for (int neighbor : adjList.get(node)) {
                dp[neighbor] += dp[node];
            }
        }

        // Return the number of paths from the source to the destination node
        return dp[destination];
    }

    private static List<Integer> topologicalSort(List<List<Integer>> adjList) {
        int n = adjList.size();
        List<Integer> order = new ArrayList<>();
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(adjList, i, visited, order);
            }
        }

        Collections.reverse(order);
        return order;
    }

    private static void dfs(List<List<Integer>> adjList, int node, boolean[] visited, List<Integer> order) {
        visited[node] = true;

        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                dfs(adjList, neighbor, visited, order);
            }
        }

        order.add(node);
    }
}
