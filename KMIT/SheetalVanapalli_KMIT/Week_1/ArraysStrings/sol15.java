import java.util.*;
public class sol15 {
   
    public static int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (true) {
            int pivotIndex = partition(nums, left, right);
            if (pivotIndex == n - k) {
                return nums[pivotIndex];
            } else if (pivotIndex < n - k) {
                left = pivotIndex + 1;
            } else {
                right = pivotIndex - 1;
            }
        }
    }
    public static int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (nums[j] < pivot) {
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, i, right);
        return i;
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(findKthLargest(nums, k));
        sc.close();
    } 
}