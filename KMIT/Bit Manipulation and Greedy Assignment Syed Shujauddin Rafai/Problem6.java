import java.util.*;
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(final int[] A) {
        int ans = 0;
        for(int i = 0; i < 32; i++) {
            int count = 0;
            for(int j = 0; j < A.length; j++) {
                if((A[j] & (1 << i)) != 0) {
                    count++;
                }
            }
            if(count % 3 != 0) {
                ans = ans | (1 << i);
            }
        }
        return ans;
    }
}
