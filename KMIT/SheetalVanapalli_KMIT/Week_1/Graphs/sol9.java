

import java.util.*;
public class sol9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        int numNodes = sc.nextInt();
        List<int[]> graph = new ArrayList<>();
        System.out.print("Enter the number of edges: ");
        int numEdges = sc.nextInt();
        System.out.println("Enter the edges:");
        for (int i = 0; i < numEdges; i++) {
            int source = sc.nextInt();
            int destination = sc.nextInt();
            graph.add(new int[]{source, destination});
        }
        System.out.print("source = ");
        int source = sc.nextInt();
        System.out.print("destination = ");
        int destination = sc.nextInt();
        int numPaths = findNumberOfPaths(graph, numNodes, source, destination);
        System.out.println(numPaths);
        sc.close();
    }

    public static int findNumberOfPaths(List<int[]> graph, int numNodes, int source, int destination) {
        int[] numPaths = new int[numNodes];
        numPaths[source] = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int[] edge : graph) {
                int currentSource = edge[0];
                int currentDestination = edge[1];
                if (currentSource == node) {
                    numPaths[currentDestination] += numPaths[currentSource];
                    queue.offer(currentDestination);
                }
            }
        }
        return numPaths[destination];
    }
}