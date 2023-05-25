import java.util.Scanner;

class pr7 {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public pr7(int k) {
        arr = new int[k];
        front = -1;
        rear = -1;
        size = 0;
        capacity = k;
    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        } else if (isEmpty()) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = capacity - 1;
        } else {
            front--;
        }
        arr[front] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        } else if (isEmpty()) {
            front = 0;
            rear = 0;
        } else if (rear == capacity - 1) {
            rear = 0;
        } else {
            rear++;
        }
        arr[rear] = value;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        } else if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == capacity - 1) {
            front = 0;
        } else {
            front++;
        }
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        } else if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = capacity - 1;
        } else {
            rear--;
        }
        size--;
        return true;
    }

    public int getFront() {
        return isEmpty() ? -1 : arr[front];
    }

    public int getRear() {
        return isEmpty() ? -1 : arr[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum size of the deque: ");
        int k = sc.nextInt();
        pr7 obj = new pr7(k);
        boolean param_1 = obj.insertFront(1);
        boolean param_2 = obj.insertLast(2);
        boolean param_3 = obj.insertFront(3);
        boolean param_4 = obj.insertFront(4);
        int param_5 = obj.getRear();
        boolean param_6 = obj.isFull();
        boolean param_7 = obj.deleteLast();
        boolean param_8 = obj.insertFront(4);
        int param_9 = obj.getFront();
        System.out.println(param_1 + " " + param_2 + " " + param_3 + " " + param_4 + " " + param_5 + " " + param_6 + " " + param_7 + " " + param_8 + " " + param_9);
    }
}