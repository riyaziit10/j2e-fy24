/*

Problem 10:

You are given an integer array prices where prices[i] is the price of a given stock on the i
th day.
On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
However, you can buy it then immediately sell it on the same day.
Find and return the maximum profit you can achieve.


Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.


Example 2:
Input: prices = [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on
Total profit is 4.


Example 3:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: There is no way to make a positive
Constraints:
● 1 <= prices.length <= 3 * 104
● 0 <= prices[i] <= 104 

*/

import java.util.*;
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prices[] = new int[n];
        for(int i=0;i<n;i++){
            prices[i] = sc.nextInt();
        }
        System.out.println(maxProfit(prices));
        sc.close();
    }
    public static int maxProfit(int[] prices) {
        int i=0;
        int peak = prices[0];
        int valley = prices[0];
        int maxProfit = 0;
        while(i < prices.length-1)
        {
            while(i < prices.length - 1 && prices[i] >= prices[i + 1]){
                i++;
            }
            valley=prices[i];
            while(i < prices.length - 1 && prices[i + 1] >= prices[i]){
                i++;
            }
            peak = prices[i];
            maxProfit += peak - valley;
        }
        return maxProfit;
    }
}
