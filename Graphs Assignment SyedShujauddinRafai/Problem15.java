import java.util.*;
public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        if(s.charAt(0) != '0') {
            dp[1] = 1;
        }
        for(int i = 2; i <= s.length(); i++) {
            int oneDigit = Integer.valueOf(s.substring(i - 1, i));
            int twoDigit = Integer.valueOf(s.substring(i - 2, i));
            if(oneDigit >= 1) {
                dp[i] += dp[i - 1];
            }
            if(twoDigit >= 10 && twoDigit <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        System.out.println(dp[s.length()]);
    }

}
