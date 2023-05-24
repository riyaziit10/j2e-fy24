/*
1..IMPLEMENT A STACK USING TWO QUEUES Q1 AND Q2
*/
class MyStack {
    Queue<Integer>q1;
    Queue<Integer>q2;
    public MyStack() {
    q1=new ArrayDeque<>();
    q2=new ArrayDeque<>();
    }
    public void push(int x) {
    while(!q1.isEmpty()){
    q2.offer(q1.poll());
    }
    q1.offer(x);
    while(!q2.isEmpty()){
        q1.offer(q2.poll());
    }
    }
    public int pop() {
        return q1.poll();
    }
    public int top() {
        return q1.peek();
    }
    public boolean empty() {
        if(q1.isEmpty()){
            return true;
    }
    return false;
    }
}
