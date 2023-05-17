import java.util.Arrays;
import java.util.Stack;

public class problem7 {

    public static int[] nextGreaterElement(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, -1); // Initialize all values to -1
        Stack<Integer> stack = new Stack<>(); // Create a stack to hold indices

        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                // If the current number is greater than the number at the top of the stack,
                // then the current number is the next greater element for the number at the
                // top of the stack.
                result[stack.pop()] = nums[i];
            }
            stack.push(i); // Push the current index onto the stack
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = { 4, 5, 2, 25 };
        int[] nums2 = { 13, 7, 6, 12 };
        System.out.println(Arrays.toString(nextGreaterElement(nums1))); // Output: [5, 25, 25, -1]
        System.out.println(Arrays.toString(nextGreaterElement(nums2))); // Output: [-1, 12, 12, -1]
    }
}
