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

public class Graph3 {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Map<Node, Node> visited = new HashMap<>();
        return cloneNode(node, visited);
    }

    private Node cloneNode(Node node, Map<Node, Node> visited) {
        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        Node clone = new Node(node.label);
        visited.put(node, clone);

        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(cloneNode(neighbor, visited));
        }

        return clone;
    }
}
