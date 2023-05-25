import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int V = sc.nextInt();
        int a[] = new int[N];
        for(int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            if(V > 0) {
                if(a[i] > 1) {
                    V += a[i] - 1;
                }
                else {
                    V--;
                }
            }
            else {
                break;
            }
        }
        System.out.println(V);
    }
}
