import java.util.LinkedList;
import java.util.Queue;

/**
 * sol1
 */
import java.util.*;
class StackImp{
    Queue <Integer> q1 = new LinkedList<>();
    Queue <Integer> q2 = new LinkedList<>();
    void push(int x){
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }
        q1.add(x);
        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }
    }
    int pop(){
        if(q1.isEmpty())    return -1;
        return q1.remove();
    }
}
public class sol1 {
    public static void main(String[] args) {
        StackImp stk = new StackImp();
        stk.push(2);
        stk.push(3);
        System.out.print(stk.pop()+" ");
        stk.push(4);
        System.out.print(stk.pop()+" ");
        System.out.print(stk.pop()+" ");
        System.out.print(stk.pop()+" ");
    }
}