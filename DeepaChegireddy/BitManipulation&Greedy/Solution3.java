import java.util.*;
class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            Vector<Long> a = new Vector<>();
            long mn = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                long num = scanner.nextLong();
                a.add(num);
                mn = Math.min(mn, num);
            }
            long ans = 0;
            for (int i = 0; i < n; i++) {
                ans += a.get(i) - mn;
            }
            System.out.println(ans);

    }
}
