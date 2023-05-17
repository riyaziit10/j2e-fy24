/* 

PROBLEM 2:

IMPLEMENT A QUEUE USING 2 STACKS S1 AND S2 .
A Query Q is of 2 Types:
(i) 1 x (a query of this type means pushing 'x' into the queue)
(ii) 2 (a query of this type means to pop element from queue and print the poped element)


Example 1:
Input:5
1 2 1 3 2 1 4 2
Output: 2 3
Explanation: In the first testcase
1 2 the queue will be {2}
1 3 the queue will be {2 3}
2   poped element will be 2, the queue will be {3}
1 4 the queue will be {3 4}
2   poped element will be 3.


Example 2:
Input:4
1 2 2 2 1 4
Output: 2 -1
Explanation: In the second testcase 
1 2 the queue will be {2}
2   poped element will be 2 and then the queue will be empty
2   the queue is empty and hence -1
1 4 the queue will be {4}.


Your Task:
You are required to write two methods push which take one argument an integer 'x' to be pushed into the queue and pop
which returns a integer poped out from other queue(-1 if the queue is empty).
Expected Time Complexity : O(1) for push() and O(N) for pop() or O(N) for push() and O(1) for pop()
Expected Auxilliary Space : O(1).


Constraints:
1 <= Q <= 100
1 <= x <= 100


Note: The Input/Ouput format and Example given are used for system's internal purpose, and should be used by a user for
Expected Output only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to
complete the function specified, and not to write the full code.
*/



import java.util.*;
public class Problem2 {
    private Stack<Integer> s1;
    private Stack<Integer> s2;
    public Problem2() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    public void enqueue(int val) {
        s1.push(val);
    }
    public int dequeue() {
        if (s2.isEmpty()) {
            if (s1.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    public static void main(String[] args) {
        Problem2 queue = new Problem2();
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        queue.enqueue(4);
        System.out.println(queue.dequeue());  
    }
}
