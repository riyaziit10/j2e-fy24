import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Node {
    int label;
    List<Node> neighbors;

    Node(int label) {
        this.label = label;
        this.neighbors = new ArrayList<>();
    }
}

public class g3 {
    public static void main(String[] args) {
        List<int[]> graph = new ArrayList<>();
        graph.add(new int[] { 1, 2 });
        graph.add(new int[] { 2, 3 });
        graph.add(new int[] { 3, 4 });
        graph.add(new int[] { 4, 5 });
        graph.add(new int[] { 5, 1 });

        Node clonedGraph = cloneGraph(graph);

        // Print the cloned graph
        printGraph(clonedGraph);
    }

    public static Node cloneGraph(List<int[]> graph) {
        Map<Integer, Node> nodeMap = new HashMap<>();

        // Create all nodes in the graph
        for (int[] edge : graph) {
            int src = edge[0];
            int dest = edge[1];

            nodeMap.putIfAbsent(src, new Node(src));
            nodeMap.putIfAbsent(dest, new Node(dest));
        }

        // Add neighbors to each node
        for (int[] edge : graph) {
            int src = edge[0];
            int dest = edge[1];

            Node srcNode = nodeMap.get(src);
            Node destNode = nodeMap.get(dest);

            srcNode.neighbors.add(destNode);
        }

        // Return the cloned graph (clone of the starting node)
        return nodeMap.get(graph.get(0)[0]);
    }

    public static void printGraph(Node node) {
        if (node == null)
            return;

        System.out.print("[" + node.label + ",");
        for (Node neighbor : node.neighbors) {
            System.out.print(neighbor.label + ",");
        }
        System.out.println("]");

        for (Node neighbor : node.neighbors) {
            printGraph(neighbor);
        }
    }
}
