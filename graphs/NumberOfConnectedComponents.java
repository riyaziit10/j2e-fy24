import java.util.*;

public class NumberOfConnectedComponents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        List<int[]> edges = new ArrayList<>();
        System.out.print("Enter the number of edges: ");
        int numEdges = scanner.nextInt();

        System.out.println("Enter the edges:");
        for (int i = 0; i < numEdges; i++) {
            int node1 = scanner.nextInt();
            int node2 = scanner.nextInt();
            edges.add(new int[]{node1, node2});
        }

        int numComponents = findNumberOfConnectedComponents(n, edges);
        System.out.println("Number of connected components: " + numComponents);

        scanner.close();
    }

    public static int findNumberOfConnectedComponents(int n, List<int[]> edges) {
        if (n <= 0) {
            return 0;
        }

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int node1 = edge[0];
            int node2 = edge[1];
            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }

        boolean[] visited = new boolean[n];
        int numComponents = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                numComponents++;
                dfs(i, graph, visited);
            }
        }

        return numComponents;
    }

    private static void dfs(int node, List<List<Integer>> graph, boolean[] visited) {
        visited[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited);
            }
        }
    }
}
