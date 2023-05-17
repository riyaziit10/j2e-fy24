/*
Problem 7:

0/1 Knapsack Problem: We are given N items where each item has some weight and profit associated with it. We are also
given a bag with capacity W, [i.e., the bag can hold at most W weight in it]. The target is to put the items into the bag such that
the sum of profits associated with them is the maximum possible.

The constraint here is we can either put an item completely into the bag or cannot put it at all [It is not possible to put a part of
an item into the bag].


Example 1:
Input: N = 3, W = 4, profit[] = {1, 2, 3}, weight[] = {4, 5, 1}
Output: 3
Explanation: There are two items which have weight less than or equal to 4. If we sele


Example 2:
Input: N = 3, W = 50, profit[] = {60, 100, 120}, weight[] = {10, 20, 30}
Output: 220


Constraints:
1 <= N <= 10
1 <= W <= 50

*/


import java.util.*;
public class Problem7 {
    public static int knapsack(int N, int W, int[] profits, int[] weights) {
        int[][] dp = new int[N + 1][W + 1];
        for (int i = 0; i <= N; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j <= W; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= W; j++) {
                if (weights[i - 1] <= j) {
                    dp[i][j] = Math.max(profits[i - 1] + dp[i - 1][j - weights[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[N][W];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt(); 
        int W= sc.nextInt(); 
        int[] profits =new int[N];
        int[] weights = new int[W];
        for(int i=0;i<N;i++){
            profits[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            weights[i]=sc.nextInt();
        }
        int maxProfit = knapsack(N, W, profits, weights);
        System.out.println(maxProfit);
        sc.close();
    }
}
