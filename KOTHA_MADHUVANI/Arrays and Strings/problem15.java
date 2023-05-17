import java.util.Random;

public class problem15 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        int kthLargest = findKthLargest(nums, k);
        System.out.println(kthLargest);
    }

    public static int findKthLargest(int[] nums, int k) {
        int left = 0, right = nums.length - 1;
        Random rand = new Random();

        while (left <= right) {
            int pivotIndex = left + rand.nextInt(right - left + 1);
            int newPivotIndex = partition(nums, left, right, pivotIndex);

            if (newPivotIndex == nums.length - k) {
                return nums[newPivotIndex];
            } else if (newPivotIndex > nums.length - k) {
                right = newPivotIndex - 1;
            } else {
                left = newPivotIndex + 1;
            }
        }

        return -1;
    }

    private static int partition(int[] nums, int left, int right, int pivotIndex) {
        int pivotValue = nums[pivotIndex];
        swap(nums, pivotIndex, right);
        int newPivotIndex = left;

        for (int i = left; i < right; i++) {
            if (nums[i] < pivotValue) {
                swap(nums, i, newPivotIndex);
                newPivotIndex++;
            }
        }

        swap(nums, right, newPivotIndex);
        return newPivotIndex;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
