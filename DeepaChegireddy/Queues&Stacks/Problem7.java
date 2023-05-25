import java.util.*;
public class Problem7 {
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        
        long[] r=new long[n];
        r[n-1]=-1;
        Stack<Long>s=new Stack<>();
        s.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            long v=arr[i];
        
        while(s.isEmpty()==false &&v>=s.peek())
        {
            
                s.pop();
            
        }
        if(s.isEmpty()==true){
            r[i]=-1;
        }
        else{
            r[i]=s.peek();
        }
        s.push(v);
        }
        return r;
    }
    public static void main(String[] args) {
        long[] arr = {4,5,2,25};
        int n = arr.length;
        System.out.println(Arrays.toString(nextLargerElement(arr,n)));
    }
}
