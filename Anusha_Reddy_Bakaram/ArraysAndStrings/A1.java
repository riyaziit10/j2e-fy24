import java.util.*;
class A1{
    public  boolean[] greatest(int arr[],int extra){
        boolean ans[]=new boolean[arr.length];
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            max=Math.max(max,i);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]+extra>=max){
                ans[i]=true;
            }
        }
        return ans;
    }
   
}