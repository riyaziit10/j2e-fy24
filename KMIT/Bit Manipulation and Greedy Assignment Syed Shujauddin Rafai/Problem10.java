import java.util.*;
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(reverse(n));
    }
    public static long reverse(long a) {
        long ans = 0;
        for(int i = 0; i < 32; i++) {
            if((a & (1 << i)) != 0) {
                ans |= (1 << (31 - i));
            }
        }
        return ans;
    }
}
