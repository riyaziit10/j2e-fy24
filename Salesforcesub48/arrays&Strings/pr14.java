import java.util.*;
class pr14{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(solve(arr));
    }
    public static int solve(int[] nums) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        while (right < nums.length) {
            if (nums[right] == 1) {
                right++;
            } else {
                maxLength = Math.max(maxLength, right - left);
                left = right + 1;
                right = left;
            }
        }
        maxLength = Math.max(maxLength, right - left);
        return maxLength;
    }

}