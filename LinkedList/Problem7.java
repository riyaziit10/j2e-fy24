/*
Problem 7:

Design your implementation of the circular double-ended queue (deque).

Implement the MyCircularDeque class:
● MyCircularDeque(int k) Initializes the deque with a maximum size of k.
● boolean insertFront() Adds an item at the front of Deque. Returns true if the operation is successful, or false
otherwise.
● boolean insertLast() Adds an item at the rear of Deque. Returns true if the operation is successful, or false
otherwise.
● boolean deleteFront() Deletes an item from the front of Deque. Returns true if the operation is successful, or
falseotherwise.
● boolean deleteLast() Deletes an item from the rear of Deque. Returns true if the operation is successful, or
falseotherwise.
● int getFront() Returns the front item from the Deque. Returns -1 if the deque is empty.
● int getRear() Returns the last item from Deque. Returns -1 if the deque is empty.
● boolean isEmpty() Returns true if the deque is empty, or false otherwise.
● boolean isFull() Returns true if the deque is full, or false otherwise.


Example 1:
Input
["MyCircularDeque", "insertLast", "insertLast", "insertFront",
"insertFront", "getRear", "isFull", "deleteLast", "insertFront", "getFront"]
[[3], [1], [2], [3], [4], [], [], [], [4], []]
Output
[null, true, true, true, false, 2, true, true, true, 4]
Explanation
MyCircularDeque myCircularDeque = new MyCircularDeque(3);
myCircularDeque.insertLast(1);  // return True
myCircularDeque.insertLast(2);  // return True
myCircularDeque.insertFront(3); // return True
myCircularDeque.insertFront(4); // return False, the queue is full.
myCircularDeque.getRear();      // return 2
myCircularDeque.isFull();       // return True
myCircularDeque.deleteLast();   // return True
myCircularDeque.insertFront(4); // return True
myCircularDeque.getFront();     // return 4


Constraints:
● 1 <= k <= 1000
● 0 <= value <= 1000
● At most 2000 calls will be made to insertFront, insertLast, deleteFront, deleteLast, getFront,
getRear, isEmpty, isFull.

*/


class Problem7 {
    private int size;
    private int capacity;
    private Node head;
    private Node tail;

    private class Node {
        int value;
        Node prev;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }
    public Problem7(int k) {
        this.size = 0;
        this.capacity = k;
        this.head = null;
        this.tail = null;
    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return true;
    }

    public int getFront() {
        return isEmpty() ? -1 : head.value;
    }

    public int getRear() {
        return isEmpty() ? -1 : tail.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        Problem7 circularDeque = new Problem7(3);
        System.out.println(circularDeque.insertLast(1));  
        System.out.println(circularDeque.insertLast(2));  
        System.out.println(circularDeque.insertFront(3)); 
        System.out.println(circularDeque.insertFront(4)); 
        System.out.println(circularDeque.getRear());     
        System.out.println(circularDeque.isFull());       
        System.out.println(circularDeque.deleteLast());   
        System.out.println(circularDeque.insertFront(4));
        System.out.println(circularDeque.getFront());    
    }
    
}
