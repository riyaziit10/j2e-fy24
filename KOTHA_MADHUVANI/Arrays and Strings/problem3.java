import java.util.Arrays;

public class problem3 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }
                if (sum > target) {
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    return target;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        int[] nums1 = { -1, 2, 1, -4 };
        int target1 = 1;
        System.out.println(threeSumClosest(nums1, target1)); // expected output: 2

        int[] nums2 = { 0, 0, 0 };
        int target2 = 1;
        System.out.println(threeSumClosest(nums2, target2)); // expected output: 0
    }
}
