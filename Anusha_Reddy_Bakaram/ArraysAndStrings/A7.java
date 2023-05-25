import java.util.*;
public class A7 {
    public int maxSubArray(int[] nums) {
        // int max=Integer.MIN_VALUE;
        // int sum=0;
        // for(int i=0;i<nums.length;i++){
        //     sum+=nums[i];
        //      max=Math.max(sum,max);
        //     if(sum<0){
        //         sum=0;
        //     } 
        // }
        // return max;
        int max=nums[0],prev=nums[0],curr=nums[0];
        for(int i=1;i<nums.length;i++){
            curr=Math.max(prev+nums[i],nums[i]);
            max=Math.max(curr,max);
            prev=curr;
        }
        return max;
    }

}
