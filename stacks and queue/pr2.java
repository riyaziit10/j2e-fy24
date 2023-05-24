import java.util.*;

class pr2 {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public pr2() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void enqueue(int x) {
        s1.push(x);
    }

    public int dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        if (s2.isEmpty()) {
            return -1;
        }
        return s2.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        pr2 queue = new pr2();
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                queue.enqueue(arr[i + 1]);
                i++;
            } else if (arr[i] == 2) {
                System.out.println(queue.dequeue());
            }
        }
    }
}
