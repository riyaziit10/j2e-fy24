/*
Question 2:

You are given an integer array coins representing coins of different denominations and an integer amount
representing a total amount of money.
Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made
up by any combination of the coins, return -1.
You may assume that you have an infinite number of each kind of coin.


Example 1:
Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1


Example 2:
Input: coins = [2], amount = 3
Output: -1

*/


import java.util.*;
public class Problem2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for(int i=0; i<n; i++){
            coins[i] = sc.nextInt();
        }
        int amount = sc.nextInt();
        System.out.println(combinations(coins, amount));
        sc.close();
    }
    public static int combinations(int[] coins, int amount)
    {
        Arrays.sort(coins);
        int count = 0;
        int remainingAmount = amount;
        for (int i = coins.length - 1; i >= 0; i--) {
            int coin = coins[i];
            while (remainingAmount >= coin) {
                remainingAmount -= coin;
                count++;
            }
            if (remainingAmount == 0) {
                break;
            }
        }
        return remainingAmount == 0 ? count : -1;
    }
}
