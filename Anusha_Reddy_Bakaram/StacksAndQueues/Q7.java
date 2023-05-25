import java.util.*;
class Q7{
    int[] nextRight(int arr[]){
        Stack<Integer>st=new Stack<>();
        int nextGreater[]=new int[arr.length];
        for(int i=arr.length;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nextGreater[i]=-1;
            }
            else{
                nextGreater[i]=arr[st.peek()];
            }
            st.push(i);
        }
       return nextGreater; 
    }
}
