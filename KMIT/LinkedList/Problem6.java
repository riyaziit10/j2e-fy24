/*
Problem 6:

Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

Implement the LRUCache class:
● LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
● int get(int key) Return the value of the key if the key exists, otherwise return -1.
● void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value
pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.

The functions get and put must each run in O(1) average time complexity.


Example 1:
Input:
["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
Output:
[null, null, null, 1, null, -1, null, -1, 3, 4]
Explanation
LRUCache lRUCache = new LRUCache(2);
lRUCache.put(1, 1); // cache is {1=1}
lRUCache.put(2, 2); // cache is {1=1, 2=2}
lRUCache.get(1);    // return 1
lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
lRUCache.get(2);    // returns -1 (not found)
lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
lRUCache.get(1);    // return -1 (not found)
lRUCache.get(3);    // return 3
lRUCache.get(4);    // return 4


Constraints:
● 1 <= capacity <= 3000
● 0 <= key <= 104
● 0 <= value <= 105
● At most 2 * 105

calls will be made to get and put.
*/


import java.util.*;

class Problem6 {
    private int capacity;
    private Map<Integer, Integer> cacheMap;
    private LinkedList<Integer> keys;

    public Problem6(int capacity) {
        this.capacity = capacity;
        this.cacheMap = new HashMap<>();
        this.keys = new LinkedList<>();
    }

    public int get(int key) {
        if (cacheMap.containsKey(key)) {
            keys.removeFirstOccurrence(key);
            keys.addFirst(key);
            return cacheMap.get(key);
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (cacheMap.containsKey(key)) {
            keys.removeFirstOccurrence(key);
        } else if (cacheMap.size() == capacity) {
            int leastRecentlyUsed = keys.removeLast();
            cacheMap.remove(leastRecentlyUsed);
        }
        keys.addFirst(key);
        cacheMap.put(key, value);
    }

    public static void main(String[] args) {
        Problem6 cache = new Problem6(2);
    
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));       
        cache.put(3, 3);                     
        System.out.println(cache.get(2));       
        cache.put(4, 4);                     
        System.out.println(cache.get(1));       
        System.out.println(cache.get(3));   
        System.out.println(cache.get(4));      
    }
    
}
