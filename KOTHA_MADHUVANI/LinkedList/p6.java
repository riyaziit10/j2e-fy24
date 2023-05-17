import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache {
    private LinkedHashMap<Integer, Integer> cache;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        cache.put(key, value);
    }
}

public class p6 {
    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1);
        lRUCache.put(2, 2);
        System.out.println(lRUCache.get(1)); // Output: 1
        lRUCache.put(3, 3);
        System.out.println(lRUCache.get(2)); // Output: -1
        lRUCache.put(4, 4);
        System.out.println(lRUCache.get(1)); // Output: -1
        System.out.println(lRUCache.get(3)); // Output: 3
        System.out.println(lRUCache.get(4)); // Output: 4
    }
}
