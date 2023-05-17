public class problem11 {
    public static int find(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String args[]) {
        int[] nums = { 41,
                2,
                1,
                3,
                5,
                6,
                4 };
        System.out.println(find(nums)); // Output: 4
    }
}
