import java.util.*;

public class g7 {
    public static void main(String[] args) {
        int n = 6;
        int[][] edges = { { 0, 1 }, { 0, 2 }, { 0, 3 }, { 3, 4 }, { 4, 5 } };

        List<Integer> mhts = findMinHeightTrees(n, edges);
        System.out.println("Minimum Height Trees: " + mhts);
    }

    public static List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) {
            return Collections.singletonList(0); // Special case: Only one node
        }

        // Create an adjacency list to represent the undirected graph
        List<Set<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new HashSet<>());
        }

        // Populate the adjacency list based on the given edges
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        // Initialize a queue to perform a level order traversal starting from the leaf
        // nodes
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (adjList.get(i).size() == 1) {
                queue.offer(i); // Leaf nodes as starting points
            }
        }

        while (n > 2) {
            int size = queue.size();
            n -= size;

            for (int i = 0; i < size; i++) {
                int node = queue.poll();

                // Remove the current leaf node from its neighboring nodes' adjacency lists
                for (int neighbor : adjList.get(node)) {
                    adjList.get(neighbor).remove(node);
                    if (adjList.get(neighbor).size() == 1) {
                        queue.offer(neighbor); // New leaf nodes
                    }
                }
            }
        }

        // The remaining nodes in the queue are the MHT roots
        return new ArrayList<>(queue);
    }
}
