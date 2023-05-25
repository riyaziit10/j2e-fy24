import java.util.*;

public class Problem9 {
    public int countPaths(int[][] graph, int source, int destination) {
        int numNodes = graph.length;
        int[] numPaths = new int[numNodes];
        numPaths[source] = 1;

        for (int[] edge : graph) {
            int u = edge[0];
            int v = edge[1];
            numPaths[v] += numPaths[u];
        }

        return numPaths[destination];
    }

    public static void main(String[] args) {
        int[][] graph = {{0, 1}, {0, 2}, {1, 2}, {1, 3}, {2, 3}};
        int source = 0;
        int destination = 3;

        Problem9 p = new Problem9();
        int numPaths = p.countPaths(graph, source, destination);

        System.out.println("Number of paths: " + numPaths);
    }
}
