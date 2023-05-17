import java.util.HashMap;

public class problem4 {
    private final int capacity;
    private final HashMap<Integer, Node> cache;
    private Node head, tail;

    public problem4(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
    }

    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    public void set(int key, int value) {
        Node node = cache.get(key);
        if (node != null) {
            node.value = value;
            moveToHead(node);
        } else {
            node = new Node(key, value);
            if (cache.size() >= capacity) {
                removeTail();
            }
            addToHead(node);
            cache.put(key, node);
        }
    }

    private void moveToHead(Node node) {
        if (node == head) {
            return;
        }
        if (node == tail) {
            tail = node.prev;
            tail.next = null;
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        node.prev = null;
        node.next = head;
        head.prev = node;
        head = node;
    }

    private void addToHead(Node node) {
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    private void removeTail() {
        if (tail == null) {
            return;
        }
        cache.remove(tail.key);
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    private static class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        problem4 cache = new problem4(2);
        cache.set(1, 2);
        System.out.println(cache.get(1)); // prints 2
        cache.set(2, 3);
        cache.set(1, 5);
        cache.set(4, 5);
        cache.set(6, 7);
        System.out.println(cache.get(4)); // prints 5
        cache.set(1, 2);
        System.out.println(cache.get(3)); // prints -1
    }
}
