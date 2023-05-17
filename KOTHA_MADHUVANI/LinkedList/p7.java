class MyCircularDeque {
    private int[] deque;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public MyCircularDeque(int k) {
        capacity = k;
        deque = new int[k];
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean insertFront(int value) {
        if (isFull())
            return false;

        front = (front - 1 + capacity) % capacity;
        deque[front] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull())
            return false;

        deque[rear] = value;
        rear = (rear + 1) % capacity;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty())
            return false;

        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty())
            return false;

        rear = (rear - 1 + capacity) % capacity;
        size--;
        return true;
    }

    public int getFront() {
        if (isEmpty())
            return -1;

        return deque[front];
    }

    public int getRear() {
        if (isEmpty())
            return -1;

        return deque[(rear - 1 + capacity) % capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}

public class p7 {
    public static void main(String[] args) {
        MyCircularDeque myCircularDeque = new MyCircularDeque(3);
        System.out.println(myCircularDeque.insertLast(1)); // Output: true
        System.out.println(myCircularDeque.insertLast(2)); // Output: true
        System.out.println(myCircularDeque.insertFront(3)); // Output: true
        System.out.println(myCircularDeque.insertFront(4)); // Output: false
        System.out.println(myCircularDeque.getRear()); // Output: 2
        System.out.println(myCircularDeque.isFull()); // Output: true
        System.out.println(myCircularDeque.deleteLast()); // Output: true
        System.out.println(myCircularDeque.insertFront(4)); // Output: true
        System.out.println(myCircularDeque.getFront()); // Output: 4
    }
}
