import java.util.Arrays;

public class sol3 {
    static int getClosestSum(int []arr, int target){
        Arrays.sort(arr);
        int closestsum=0; 
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-2;i++){
            int l=i+1, r=arr.length-1;
            while(l<r){
                int sum = arr[l]+arr[r]+arr[i];
                if(sum==target) return target;
                if(sum>target)  r--;
                else l++;

                int diff = Math.abs(target-sum);
                if(diff<minDiff){
                    minDiff = diff;
                    closestsum = sum;
                }
            }
        }
        return closestsum;
    }
    public static void main(String[] args) {
        // int []arr = {-1,2,1,-4};
        // int []arr = {4,0,5,-5,3,3,0,-4,-5};
        int []arr = {1,1,1,0};
        int target = -100;
        System.out.println(getClosestSum(arr,target));

    }
}
