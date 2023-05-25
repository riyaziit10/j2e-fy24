import java.util.*;
public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] sorted = new int[n];
        for(int i = 0; i < n; i++) {
            sorted[i] = nums[i];
        }
        Arrays.sort(sorted);
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] != sorted[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
