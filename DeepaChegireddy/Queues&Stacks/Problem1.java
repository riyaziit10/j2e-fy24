
import java.util.LinkedList;
import java.util.Queue;

class Problem1 {
    static Queue<Integer> q1;
    static Queue<Integer> q2;

    public Problem1() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public static void push(int value) {
        if (q1.isEmpty()) {
            q1.add(value);
            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        } else {
            q2.add(value);
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
        }
    }

    public static int pop() {
       if (!q1.isEmpty()) {
            return q1.remove();
        } else if (!q2.isEmpty()) {
            return q2.remove();
        } 
        return -1;
    }

    public static int  top() {
        if (!q1.isEmpty()) {
            return q1.peek();
        } else if (!q2.isEmpty()) {
            return q2.peek();
        } 
        return -1;
    }

    public static boolean isEmpty() {
        return q1.isEmpty() && q2.isEmpty();
    }
    public static void main(String[] args) {
        Problem1 stack = new Problem1();
        stack.push(10);
        stack.push(27);
        stack.push(300);

        System.out.println(stack.pop());  
        System.out.println(stack.top());  
        System.out.println(stack.isEmpty());  
        System.out.println(stack.pop()); 
        System.out.println(stack.pop()); 
        

    }
}
