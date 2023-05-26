import java.util.*;
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(findMinXor(A));
    }
    public static int findMinXor(int[] A) {
        Arrays.sort(A);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < A.length - 1; i++) {
            min = Math.min(min, A[i] ^ A[i + 1]);
        }
        return min;
    }
}
