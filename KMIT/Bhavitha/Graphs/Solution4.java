/*
4. Given a matrix of 0's and 1's, implement a function to find the number of islands in the matrix, where an island is a group of connected 1's. 
Example: Input: matrix = [[1,1,1,1,0], [1,1,0,1,0], [1,1,0,0,0], [0,0,0,0,0]] Output: 1
*/
class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
       for(int i=0;i<grid.length;i++)
       {
           for(int j=0;j<grid[0].length;j++)
           {
               if(grid[i][j]=='1')
               {
                   count++;
                   func(grid,i,j);

               }
           }
       }
       return count; 
    }
    public void func(char[][] grid,int i,int j)

    {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length ||grid[i][j]=='0' ||grid[i][j]=='2')
        {
            return;
        }
        grid[i][j]='2';
        func(grid,i+1,j);
        func(grid,i-1,j);
        func(grid,i,j+1);
        func(grid,i,j-1);
    }
}
