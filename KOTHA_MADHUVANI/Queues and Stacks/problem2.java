import java.util.Stack;

class Queue {
    private Stack<Integer> pushStack;
    private Stack<Integer> popStack;

    public Queue() {
        pushStack = new Stack<>();
        popStack = new Stack<>();
    }

    public void push(int x) {
        pushStack.push(x);
    }

    public int pop() {
        if (popStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }

        if (popStack.isEmpty()) {
            return -1; // Queue is empty
        }

        return popStack.pop();
    }
}

public class problem2 {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(2);
        q.push(3);
        System.out.println(q.pop()); // Output: 2
        q.push(4);
        System.out.println(q.pop()); // Output: 3
        System.out.println(q.pop()); // Output: 4
        System.out.println(q.pop()); // Output: -1 (Queue is empty)
    }
}
