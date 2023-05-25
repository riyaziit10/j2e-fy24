public class Problem15 {
    public static int numDecodings(String s) {
        if (s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            int currentDigit = Character.getNumericValue(s.charAt(i - 1));
            int previousDigit = Character.getNumericValue(s.charAt(i - 2));
            if (currentDigit >= 1 && currentDigit <= 9) {
                dp[i] += dp[i - 1];
            }

            int twoDigitNumber = previousDigit * 10 + currentDigit;
            if (twoDigitNumber >= 10 && twoDigitNumber <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }
}
