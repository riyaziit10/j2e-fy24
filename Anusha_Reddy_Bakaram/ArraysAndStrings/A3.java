import java.util.*;
public class A3 {
    public int closestTarget(int n,int arr[],int target){
        int closesum=0;
        int mindis=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(Math.abs(target-sum)<Math.abs(mindis)){
                    mindis=target-sum;
                }
                if(sum<target){

                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return target-mindis;
    }
   
}
