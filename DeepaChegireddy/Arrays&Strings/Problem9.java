import java.util.*;
public class Problem9 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,0,2,1,1,0};
        int[] arr = new int[nums.length];
        Arrays.fill(arr,1);
        int s=0;
        int l=nums.length-1;
        for(int i=0; i< nums.length; i++){
            if(nums[i]==0){
                arr[s]=0;                
                s++;
            }
            else if(nums[i]==2){
                arr[l]=2;
                l--;
            }
        }
        for(int j=0; j<arr.length; j++){
            nums[j]=arr[j];
        }
        System.out.println(Arrays.toString(nums));
    }
}