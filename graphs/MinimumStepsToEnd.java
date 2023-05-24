import java.util.*;

public class MinimumStepsToEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int minSteps = findMinimumSteps(nums);
        System.out.println("Minimum number of steps to reach the end: " + minSteps);

        scanner.close();
    }

    public static int findMinimumSteps(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] minSteps = new int[n];
        Arrays.fill(minSteps, Integer.MAX_VALUE);
        minSteps[0] = 0;

        for (int i = 0; i < n; i++) {
            int maxSteps = nums[i];

            for (int j = 1; j <= maxSteps && i + j < n; j++) {
                minSteps[i + j] = Math.min(minSteps[i + j], minSteps[i] + 1);
            }
        }

        return minSteps[n - 1];
    }
}
