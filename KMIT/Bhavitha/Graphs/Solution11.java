/*
11. Implement a function to find the length of the longest increasing path in a matrix of integers, where a path is defined as a sequence of cells that are adjacent horizontally or vertically and whose values are in strictly increasing order. 
Example: Input: matrix = [[9,9,4], [6,6,8], [2,1,1]] Outp
*/
class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int ans=0;
        int max=0;
        int dp[][]=new int[m][n];
       
            for(int[] row:dp)
            {
                Arrays.fill(row,-1);
            }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                 ans=func(matrix,m,n,i,j,dp);
                 max=Math.max(ans,max);
            }
        }
        return max;
    }
    public static int func(int[][] arr,int m,int n,int i,int j,int[][] dp)
    {
        int up=0,down=0,left=0,right=0;
       if(i<0 || j<0 || i>=m || j>=n)
       {
           return 0;
       }
       if(dp[i][j]!=-1) return dp[i][j];
       if(j+1<n && arr[i][j]<arr[i][j+1])
       {
          right=  func(arr,m,n,i,j+1,dp);
       }
       if(j-1>=0 && arr[i][j]<arr[i][j-1])
       {
          left=func(arr,m,n,i,j-1,dp);
       }
       if(i-1>=0 && arr[i][j]<arr[i-1][j])
       {
            up=func(arr,m,n,i-1,j,dp);
       }
       if(i+1<m && arr[i][j]<arr[i+1][j])
       {
          down=  func(arr,m,n,i+1,j,dp);
       }
       return dp[i][j]=1+Math.max(Math.max(up,down),Math.max(right,left));
    }
}

