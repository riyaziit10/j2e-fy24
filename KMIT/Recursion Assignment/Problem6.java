import java.util.*;
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        ArrayList<ArrayList<Integer>> ans = subsets(A);
        System.out.println(ans);
    }
    public static ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < (1 << n); i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                if((i & (1 << j)) != 0) {
                    temp.add(nums[j]);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}
