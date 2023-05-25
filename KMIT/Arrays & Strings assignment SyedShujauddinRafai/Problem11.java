import java.util.*;
public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int peak = findPeakElement(nums);
        System.out.println("Peak element: " + peak);    
    }    
    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = (left + right)/2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }
}
