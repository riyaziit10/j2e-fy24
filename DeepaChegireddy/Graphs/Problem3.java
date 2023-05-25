import java.util.*;

class Node {
    int label;
    List<Node> neighbors;

    public Node(int label) {
        this.label = label;
        neighbors = new ArrayList<>();
    }
}

public class Problem3 {
    public Node cloneGraph(Node node) {
        if (node == null) return null;

        Map<Node, Node> visited = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        Node clonedRoot = new Node(node.label);
        visited.put(node, clonedRoot);
        queue.offer(node);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();

            for (Node neighbor : curr.neighbors) {
                if (!visited.containsKey(neighbor)) {
                    Node clonedNeighbor = new Node(neighbor.label);
                    visited.put(neighbor, clonedNeighbor);
                    queue.offer(neighbor);
                }

                visited.get(curr).neighbors.add(visited.get(neighbor));
            }
        }

        return clonedRoot;
    }

    public static void main(String[] args) {
        // Example usage
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.neighbors.add(node2);
        node2.neighbors.add(node3);
        node3.neighbors.add(node4);
        node4.neighbors.add(node5);
        node5.neighbors.add(node1);

        Problem3 p = new Problem3();
        Node clonedGraph = p.cloneGraph(node1);
        printGraph(clonedGraph);
    }

    public static void printGraph(Node node) {
        Set<Node> visited = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();

            if (!visited.contains(curr)) {
                visited.add(curr);
                System.out.print("Node " + curr.label + ": ");

                for (Node neighbor : curr.neighbors) {
                    System.out.print(neighbor.label + " ");
                    queue.offer(neighbor);
                }

                System.out.println();
            }
        }
    }
}
