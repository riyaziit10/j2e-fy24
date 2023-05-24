/*
4. DESIGN A DATA STRUCTURE THAT WORKS LIKE A LRU CACHE. HERE CAP DENOTES
THE CAPACITY OF THE CACHE AND Q DENOTES THE NUMBER OF QUERIES. QUERY
CAN BE OF TWO TYPES:
*/
class LRUCache {
Node head = new Node(0,0);
Node tail = new Node(0,0);
HashMap<Integer,Node> map = new HashMap<>();
int capacity;
public LRUCache(int _capacity) {
capacity = _capacity;
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
else return -1;
}
public void put(int key, int value) {
if(map.containsKey(key)){
remove(map.get(key));
}
if(map.size() == capacity){
remove(tail.prev);
}
insert(new Node(key,value));
}
private void remove(Node node){
map.remove(node.key);
node.prev.next = node.next;
node.next.prev = node.prev;
}
private void insert(Node node){
map.put(node.key,node);
Node headNext = head.next;
head.next = node;
node.prev = head;
node.next = headNext;
headNext.prev = node;
}
class Node{
Node prev,next;
int key,value;
Node(int _key,int _val){
key = _key;
value = _val;
}
}
}