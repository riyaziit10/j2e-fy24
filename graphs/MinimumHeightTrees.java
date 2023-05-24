import java.util.*;

public class MinimumHeightTrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        List<int[]> edges = new ArrayList<>();
        System.out.print("Enter the number of edges: ");
        int numEdges = scanner.nextInt();

        System.out.println("Enter the edges:");
        for (int i = 0; i < numEdges; i++) {
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            edges.add(new int[]{source, destination});
        }

        List<Integer> mhts = findMinimumHeightTrees(n, edges);
        System.out.println("Minimum Height Trees (MHTs): " + mhts);

        scanner.close();
    }

    public static List<Integer> findMinimumHeightTrees(int n, List<int[]> edges) {
        if (n <= 0) {
            return new ArrayList<>();
        }

        if (n == 1) {
            return Collections.singletonList(0);
        }

        List<Set<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new HashSet<>());
        }

        int[] degrees = new int[n];
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
            degrees[u]++;
            degrees[v]++;
        }

        Queue<Integer> leaves = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (degrees[i] == 1) {
                leaves.offer(i);
            }
        }

        while (n > 2) {
            int numLeaves = leaves.size();
            n -= numLeaves;

            for (int i = 0; i < numLeaves; i++) {
                int leaf = leaves.poll();
                Set<Integer> neighbors = graph.get(leaf);
                for (int neighbor : neighbors) {
                    degrees[neighbor]--;
                    if (degrees[neighbor] == 1) {
                        leaves.offer(neighbor);
                    }
                }
            }
        }

        return new ArrayList<>(leaves);
    }
}
