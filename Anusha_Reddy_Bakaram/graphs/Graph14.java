public class Graph14 {
    public int minSwaps(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            // Find the correct position of the current element
            while (nums[i] != i + 1) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
                swaps++;
            }
        }

        return swaps;
    }
}
