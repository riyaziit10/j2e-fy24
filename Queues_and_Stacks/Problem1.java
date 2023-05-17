/*

PROBLEM 1 : 

IMPLEMENT A STACK USING TWO QUEUES Q1 AND Q2.


Example 1:
Input:
push(2)
push(3)
pop()
push(4)
pop()
Output: 3 4
Explanation:
push(2) the stack will be {2}
push(3) the stack will be {2 3}
pop()   poped element will be 3, the stack will be {2}
push(4) the stack will be {2 4}
pop()   poped element will be 4  


Example 2:
Input:
push(2)
pop()
pop()
push(3)
Output: 2 -1


Your Task:
Expected Time Complexity: O(1) for push() and O(N) for pop() (or vice-versa).
Expected Auxiliary Space: O(1) for both push() and pop().


Constraints:
1 <= Number of queries <= 100
1 <= values of the stack <= 100

*/



import java.util.*;
public class Problem1 {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    public Problem1() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }
    public void push(int val) {
        q1.add(val);
    }
    public int pop() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        int top = q1.remove();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return top;
    }
    public static void main(String[] args) {
        Problem1 p = new Problem1();
        p.push(2);
        p.push(3);
        System.out.println(p.pop());  
        p.push(4);
        System.out.println(p.pop());   
    }
}
