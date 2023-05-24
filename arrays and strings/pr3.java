import java.util.*;
class pr3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        System.out.println(solve(arr,tar));
    }
    public static int solve(int[] nums, int tar) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2]; 
        
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (Math.abs(sum - tar) < Math.abs(closestSum - tar)) {
                    closestSum = sum;
                }
                
                if (sum < tar) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return closestSum;
    }

}