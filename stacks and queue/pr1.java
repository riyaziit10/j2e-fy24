import java.util.*;

class pr1 {
    private Queue<Integer> q1; 
    private Queue<Integer> q2; 
    public pr1() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q1.offer(x);
    }

    public int pop() {
        if (q1.isEmpty()) {
            return -1; 
        }
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }
        int poppedElement = q1.poll();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return poppedElement;
    }

    public static void main(String[] args) {
        pr1 stack = new pr1();

        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop()); 
        stack.push(4);
        System.out.println(stack.pop()); 
    }
}
