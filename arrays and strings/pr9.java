import java.util.*;
class pr9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            
            arr[i]=sc.nextInt();
        }
        sortColors(arr);
        for(int i:arr)
        System.out.print(i+" ");
        
    }
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0, k = n - 1;
        
        while (j <= k) {
            if (nums[j] == 0) {
                swap(nums, i, j);
                i++;
                j++;
            } else if (nums[j] == 1) {
                j++;
            } else {
                swap(nums, j, k);
                k--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}