import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]  = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        int avg = sum / n;
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(a[i] > avg){
                ans += a[i] - avg;
            }
        }
        System.out.println(ans);
    }
}
