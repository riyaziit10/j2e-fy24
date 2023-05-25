import java.util.*;
class Problem12
{
	static int maxLen = 10;
	static int maskLen = 130;
	static int[][] dp = new int[maxLen][maskLen];
	static boolean[][] v = new boolean[maxLen][maskLen];
	static int minSteps(int arr[], int i, int mask, int n)
	{
		if (i == n - 1)
		{
			return 0;
		}

		if (i > n - 1 || i < 0)
		{
			return 9999999;
		}
		if ((mask >> i) % 2 == 1)
		{
			return 9999999;
		}
		if (v[i][mask])
		{
			return dp[i][mask];
		}
		v[i][mask] = true;
		dp[i][mask] = 1 + Math.min(minSteps(arr, i - arr[i], (mask | (1 << i)), n),
								minSteps(arr, i + arr[i], (mask | (1 << i)), n));
		return dp[i][mask];
	}
}