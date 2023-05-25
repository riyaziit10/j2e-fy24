import java.util.*;
public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int maxConsecutiveOnes = findMaxConsecutiveOnes(nums);
        System.out.println(maxConsecutiveOnes);
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
            }
            else {
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, count);
                count = 0;
            }
        }
        maxConsecutiveOnes = Math.max(maxConsecutiveOnes, count);
        return maxConsecutiveOnes;
    }
}
