import java.util.*;
class Q2{
    Stack<Integer>s1=new Stack<>();
    Stack<Integer>s2=new Stack<>();
    boolean isEmpty(){
        return s1.isEmpty();
    }
    void add(int a){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(a);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    int remove(){
        if(isEmpty()){
            return -1;
        }
        return s1.pop();
    }
    
}
