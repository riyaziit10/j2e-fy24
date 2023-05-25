import java.util.*;
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y  = sc.nextInt();
        System.out.println(hammingDistance(x, y));
    }
    public static int hammingDistance(int x, int y) {
        int ans = 0;
        for(int i = 0; i < 32; i++) {
            if((x & (1 << i)) != (y & (1 << i))) {
                ans++;
            }
        }
        return ans;
    }
}
