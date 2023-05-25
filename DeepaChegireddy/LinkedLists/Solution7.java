import java.util.*;
class MyCircularDeque {
    private int[] q;
    private int front;
    private int size;
    private int capacity;


    public MyCircularDeque(int k) {
        q = new int[k];
        capacity = k;
    }


    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        if (!isEmpty()) {
            front = (front - 1 + capacity) % capacity;
        }
        q[front] = value;
        ++size;
        return true;
    }


    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        int idx = (front + size) % capacity;
        q[idx] = value;
        ++size;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % capacity;
        --size;
        return true;
    }


    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        --size;
        return true;
    }


    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return q[front];
    }


    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        int idx = (front + size - 1) % capacity;
        return q[idx];
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public boolean isFull() {
        return size == capacity;
    }
}