// A Dynamic Programming based solution
// for 0-1 Knapsack problem

import java.util.*;

class R7{
	static int max(int a, int b) { return (a > b) ? a : b; }
	static int knapSack(int N,int W, int wt[], int val[])
	{
		int i, w;
		int K[][] = new int[N+ 1][W + 1];
		for (i = 0;i <=N; i++) {
			for (w = 0; w <= W; w++) {
				if (i == 0 || w == 0)
					K[i][w] = 0;
				else if (wt[i - 1] <= w)
					K[i][w]= max(val[i - 1]+K[i - 1][w - wt[i - 1]],K[i - 1][w]);
				else
					K[i][w]= K[i - 1][w];
			}
		}

		return K[N][W];
	}


	public static int bagWeigh(int N,int W,int profit[],int weight[])
	{
	
		

return	knapSack(N,W, weight, profit);
    
	}
}

