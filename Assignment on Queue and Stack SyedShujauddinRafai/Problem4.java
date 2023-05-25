import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cap = sc.nextInt();
        int q = sc.nextInt();
        LRUCache lru = new LRUCache(cap);
        for(int i=0;i<q;i++){
            String s = sc.next();
            if(s.equals("SET")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                lru.set(x,y);
            }
            else{
                int x = sc.nextInt();
                System.out.println(lru.get(x));
            }
        }

    }
}
class LRUCache {
    int capacity;
    HashMap<Integer,Node> map;
    Node head;
    Node tail;
    LRUCache(int cap) {
        capacity = cap;
        map = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }
    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        return -1;
    }
    public void set(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;
            remove(node);
            insert(node);
        }
        else{
            if(map.size()==capacity){
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node node = new Node(key,value);
            map.put(key,node);
            insert(node);
        }
    }
    public void remove(Node node){
        Node next = node.next;
        Node prev = node.prev;
        prev.next = next;
        next.prev = prev;
    }
    public void insert(Node node){
        Node next = head.next;
        head.next = node;
        node.prev = head;
        node.next = next;
        next.prev = node;
    }
    public void put(int key, int value) {
    }
}
class Node{
    int key;
    int value;
    Node prev;
    Node next;
    Node(int k,int v){
        key = k;
        value = v;
    }
}
