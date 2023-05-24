/*
7 QUESTION:
Design your implementation of the circular double-ended queue (deque).
Implement the MyCircularDeque class:

SOLUTION:
*/
class MyCircularDeque {
    int[] arr;
    int count=0,size=0,front=-1,rear=-1;
    public MyCircularDeque(int k) {
        arr=new int[k];
        size=k;
    }
    
    public boolean insertFront(int value) {
        if(isFull()) return false;
        
        if(front==-1 && rear==-1){ //if we want to add at first index
            front=rear=0;
            arr[front]=value;
        }else if(front==0){ //if we add front of index 0 we need to point last index just like circle
            front=size-1;   
            arr[front]=value;
        }else{ //if not index 0 
            front--;
            arr[front]=value;
        }
        count++;    //counting
        return true;
        
    }
    
    public boolean insertLast(int value) {
        if(isFull()) return false;
        
        if(front==-1 && rear==-1){  //if we need to add first element
            front=rear=0;
            arr[rear]=value;
        }else if(rear==size-1){ //if rear at last index reset rear
            rear=0;
            arr[rear]=value;
        }else{  //if rear not at last index
            rear++;
            arr[rear]=value;
        }
        count++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()) return false;
        
        if (front == rear) {    //if rear==front that means that is only one element in arr
            front = rear = -1;
        } else if (front == size - 1) { //if front at last index
            front = 0;
        } else {
            front++;
        }
        count--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()) return false;
        
        if (front == rear) {    //if front==rear then there is only one element in arr
            front = rear = -1;
        } else if (rear == 0) { //if rear at first index
            rear = size-1;
        } else {
            rear--;
        }
        count--;
        return true;
    }
    
    public int getFront() {
        return isEmpty()?-1:arr[front];
    }
    
    public int getRear() {
        return isEmpty()?-1:arr[rear];
    }
    
    public boolean isEmpty() {
        return count==0;
    }
    
    public boolean isFull() {
        return size==count;
    }
}

