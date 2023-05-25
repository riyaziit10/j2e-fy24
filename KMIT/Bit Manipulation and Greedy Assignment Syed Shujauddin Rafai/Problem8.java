import java.util.*;
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(singleNumber(A));
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
