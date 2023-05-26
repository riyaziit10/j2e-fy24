import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int index = search(nums, target);
        System.out.println(index);
    }
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1) return binarySearch(nums, target, 0, nums.length - 1);
        if (nums[pivot] == target) return pivot;
        if (target >= nums[0]) return binarySearch(nums, target, 0, pivot - 1);
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }
    public static int findPivot(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            if (nums[start] <= nums[end]) return start;
            int mid = start + (end - start) / 2;
            int next = (mid + 1) % nums.length;
            int prev = (mid + nums.length - 1) % nums.length;
            if (nums[mid] <= nums[next] && nums[mid] <= nums[prev]) return mid;
            else if (nums[mid] <= nums[end]) end = mid - 1;
            else if (nums[mid] >= nums[start]) start = mid + 1;
        }
        return -1;
    }
    public static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target < nums[mid]) end = mid - 1;
            else if (target > nums[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    }
}
