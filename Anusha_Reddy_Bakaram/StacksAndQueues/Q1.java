import java.util.*;
class Q1
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    public boolean isEmpty(){
        return q1.isEmpty()&& q2.isEmpty();
    }
    void push(int a)
    {
	    if(!q1.isEmpty())
{
q1.add(a);

}  
else{
    q2.add(a);
}  
}
    int pop()
    {
	    if(isEmpty()){
            return -1;
        }
        int top=-1;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
            top=q1.remove();
            if(q1.isEmpty()){
                break;
            }
            q2.add(top);
        }

        }
        else{
            while(!q2.isEmpty()){
                top=q2.remove();
                if(q2.isEmpty()){
                    break;
                }
                q1.add(top);
            }
        }
        return top;

    }
	
}
