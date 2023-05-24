/*
2. Find the number of unique paths in a n X m grid, starting from [0,0] to [n-1,m-1], where
movement is only allowed either 1 cell down or 1 cell right at a time.
*/
class Solution {
public int uniquePaths(int m, int n) {
int[][] memo = new int[n][m];
return uniquePathsHelper(n-1, m-1, memo);
}
public static int uniquePathsHelper(int n, int m, int[][] memo) {
if (n == 0 && m == 0) {
return 1;
}
if (memo[n][m] != 0) {
return memo[n][m];
}
int Right = 0, Down = 0;
if (n > 0) {
Down = uniquePathsHelper(n-1, m, memo);
}
if (m > 0) {
Right = uniquePathsHelper(n, m-1, memo);
}
memo[n][m] = numPathsRight + numPathsDown;
return memo[n][m];
}
}