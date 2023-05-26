import java.util.*;
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the deque: ");
        int size = sc.nextInt();
        MyCircularDeque obj = new MyCircularDeque(size);
        System.out.println("Enter the number of operations: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the operation: ");
            String operation = sc.next();
            if (operation.equals("insertFront")) {
                System.out.println("Enter the value to be inserted: ");
                int value = sc.nextInt();
                boolean param_1 = obj.insertFront(value);
                System.out.println(param_1);
            } else if (operation.equals("insertLast")) {
                System.out.println("Enter the value to be inserted: ");
                int value = sc.nextInt();
                boolean param_1 = obj.insertLast(value);
                System.out.println(param_1);
            } else if (operation.equals("deleteFront")) {
                boolean param_1 = obj.deleteFront();
                System.out.println(param_1);
            } else if (operation.equals("deleteLast")) {
                boolean param_1 = obj.deleteLast();
                System.out.println(param_1);
            } else if (operation.equals("getFront")) {
                int param_1 = obj.getFront();
                System.out.println(param_1);
            } else if (operation.equals("getRear")) {
                int param_1 = obj.getRear();
                System.out.println(param_1);
            } else if (operation.equals("isEmpty")) {
                boolean param_1 = obj.isEmpty();
                System.out.println(param_1);
            } else if (operation.equals("isFull")) {
                boolean param_1 = obj.isFull();
                System.out.println(param_1);
            }
        }
    }
}
class MyCircularDeque{
    int[] deque;
    int front;
    int rear;
    int size;
    int count;
    public MyCircularDeque(int k) {
        deque = new int[k];
        front = -1;
        rear = 0;
        size = k;
        count = 0;
    }
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = size - 1;
        } else {
            front--;
        }
        deque[front] = value;
        count++;
        return true;
    }
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (rear == size - 1) {
            rear = 0;
        } else {
            rear++;
        }
        deque[rear] = value;
        count++;
        return true;
    }
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front++;
        }
        count--;
        return true;
    }
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            rear--;
        }
        count--;
        return true;
    }
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return deque[front];
    }
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return deque[rear];
    }
    public boolean isEmpty() {
        return count == 0;
    }
    public boolean isFull() {
        return count == size;
    }
}