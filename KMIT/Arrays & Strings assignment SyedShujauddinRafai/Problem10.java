/*You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
However, you can buy it then immediately sell it on the same day.
Find and return the maximum profit you can achieve.
Example 1:
Input: prices = [7,1,5,3,6,4]Output: 7Explanation: Buy on day 2 (price = 1) and sell
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.
Example 2:
Input: prices = [1,2,3,4,5]Output: 4Explanation: Buy on day 1 (price = 1) and sell on
Total profit is 4.
Example 3:
Input: prices = [7,6,4,3,1]Output: 0Explanation: There is no way to make a positive
Constraints:
●
●
1 <= prices.length <= 3 * 104
0 <= prices[i] <= 104 */
import java.util.*;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days:");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter the prices of the stock on each day:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            int profit = prices[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        System.out.println("Maximum profit: " + maxProfit);
    }
}
