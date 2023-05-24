import java.util.*;
public class sol4 {
    private int capacity;
    private Map<Integer, Integer> cache;
    private Deque<Integer> deque;
    public sol4(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.deque = new LinkedList<>();
    }
    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        deque.remove(key);
        deque.offerFirst(key);
        return cache.get(key);
    }
    public void set(int key, int value) {
        if (cache.containsKey(key)) {
            deque.remove(key);
        } else if (cache.size() == capacity) {
            int leastRecentlyUsed = deque.removeLast();
            cache.remove(leastRecentlyUsed);
        }
        deque.offerFirst(key);
        cache.put(key, value);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sol4 cache = new sol4(2);
        cache.set(1, 2); 
        cache.set(2, 3);
        cache.set(1, 4);
        cache.set(4, 5);
        cache.set(6, 7);
        System.out.println(cache.get(4));
        cache.set(1, 2);
        System.out.println(cache.get(3));
        sc.close();
    } 
}