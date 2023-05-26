import java.util.*;
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt();
        LRUCache lRUCache = new LRUCache(capacity);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("put")) {
                int key = sc.nextInt();
                int value = sc.nextInt();
                lRUCache.put(key, value);
            } else {
                int key = sc.nextInt();
                System.out.println(lRUCache.get(key));
            }
        }
    }

}
class LRUCache {
    int capacity;
    HashMap<Integer, Integer> map;
    LinkedList<Integer> list;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        list = new LinkedList<>();
    }
    public int get(int key) {
        if (map.containsKey(key)) {
            list.remove(new Integer(key));
            list.addFirst(key);
            return map.get(key);
        }
        return -1;
    }
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            list.remove(new Integer(key));
            list.addFirst(key);
            map.put(key, value);
        } else {
            if (list.size() == capacity) {
                int last = list.removeLast();
                map.remove(last);
            }
            list.addFirst(key);
            map.put(key, value);
        }
    }
}