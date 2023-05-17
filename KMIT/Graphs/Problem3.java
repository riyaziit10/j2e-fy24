/*
Problem3:

Implement a function to clone a directed graph, where each node contains a label and a list of its neighbors.

Example:
Input:
graph = [[1,2],[2,3],[3,4],[4,5],[5,1]]
Output:
[[1,2],[2,3],[3,4],[4,5],[5,1]]

*/



import java.util.*;
class Node {
    int label;
    List<Node> neighbors;
    Node(int label) {
        this.label = label;
        this.neighbors = new ArrayList<>();
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();
        List<Node> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new Node(i + 1));
        }
        System.out.print("Enter the number of edges: ");
        int m = sc.nextInt();
        System.out.println("Enter the edges:");
        for (int i = 0; i < m; i++) {
            int source = sc.nextInt();
            int destination = sc.nextInt();
            graph.get(source - 1).neighbors.add(graph.get(destination - 1));
        }
        sc.close();
        List<Node> clonedGraph = cloneGraph(graph);
        System.out.println("Output :");
        for (Node node : clonedGraph) {
            System.out.print(node.label + " ");
            for (Node neighbor : node.neighbors) {
                System.out.print(neighbor.label + " ");
            }
            System.out.println();
        }
    }

    public static List<Node> cloneGraph(List<Node> graph) {
        if (graph == null || graph.isEmpty()) {
            return new ArrayList<>();
        }
        Map<Node, Node> clonedNodes = new HashMap<>();
        for (Node node : graph) {
            clonedNodes.put(node, new Node(node.label));
        }
        for (Node node : graph) {
            Node clonedNode = clonedNodes.get(node);
            for (Node neighbor : node.neighbors) {
                clonedNode.neighbors.add(clonedNodes.get(neighbor));
            }
        }
        return new ArrayList<>(clonedNodes.values());
    }
}