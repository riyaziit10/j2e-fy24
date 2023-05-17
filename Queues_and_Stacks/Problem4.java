/*

PROBLEM 4:

DESIGN A DATA STRUCTURE THAT WORKS LIKE A LRU CACHE. HERE CAP DENOTES THE CAPACITY OF THE CACHE AND Q DENOTES THE 
NUMBER OF QUERIES. QUERY CAN BE OF TWO TYPES:
1. SET x y: sets the value of the key x with value y.
2. GET x: gets the key of x if present else returns -1.

The LRUCache class has two methods get() and set() which are defined as follows.
1. get(key): returns the value of the key if it already exists in the cache otherwise returns -1.
2. set(key, value): if the key is already present, update its value. If not present, add the key-value pair to the cache. If the
cache reaches its capacity it should invalidate the least recently used item before inserting the new item.
3. In the constructor of the class the capacity of the cache should be initialized.


Example 1:
Input:cap = 2
Q = 2
Queries = SET 1 2 GET 1Output: 2
Explanation: Cache Size = 2
SET 1 2 GET 1
SET 1 2 : 1 -> 2
GET 1 : Print the value corresponding to Key 1, ie 2.


Example 2:
Input:cap = 2
Q = 8
Queries = SET 1 2 SET 2 3 SET 1 5
SET 4 5 SET 6 7 GET 4 SET 1 2 GET 3Output: 5 -1
Explanation: Cache Size = 2
SET 1 2 : 1 -> 2
SET 2 3 : 1 -> 2, 2 -> 3 (the most recently used one is kept at the rightmost position)
SET 1 5 : 2 -> 3, 1 -> 5
SET 4 5 : 1 -> 5, 4 -> 5 (Cache size is 2, hence we delete the least recently used key-value pair)
SET 6 7 : 4 -> 5, 6 -> 7
GET 4 : Prints 5 (The cache now looks like 6 -> 7, 4->5)
SET 1 2 : 4 -> 5, 1 -> 2(Cache size is 2, hence we delete the least recently used key-value pair)
GET 3 : No key value pair having key = 3. Hence, -1 is printed.


Your Task:
Write the constructor and get(), and set() methods of the class LRUcache.
Expected Time Complexity: O(1) for both get() and set().
Expected Auxiliary Space: O(1) for both get() and set().
(Although, you may use extra space for cache storage and implementation purposes).


Constraints:
1 <= cap <= 10^3
1 <= Q <= 10^5
1 <= x, y <= 10^4
*/


import java.util.*;
public class Problem4 {
    private int capacity;
    private Map<Integer, Integer> cache;
    private Deque<Integer> deque;
    public Problem4(int capacity) {
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
        Problem4 cache = new Problem4(2);
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
