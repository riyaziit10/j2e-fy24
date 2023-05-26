import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int count = 0;
        Arrays.sort(A);
        for(int i = 0; i < N; i++) {
            if(i == 0) {
                count++;
            }
            else {
                if(A[i] != A[i - 1]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
