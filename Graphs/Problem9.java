/*
Problem 9:

Implement a function to find the number of paths in a directed acyclic graph (DAG) from the source node to the
destination node.


Example:
Input:
graph = [[0,1],[0,2],[1,2],[1,3],[2,3]]
source = 0, destination = 3
Output:
5


*/


import java.util.*;
public class Problem9 {
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