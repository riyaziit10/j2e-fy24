/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.
 */
class Solution {
    public int maxArea(int[] arr) {
        int max=Integer.MIN_VALUE;
    
      int i=0;
      int j=arr.length-1;
      while(i!=j)
      {
          if(Math.min(arr[i],arr[j])*Math.abs(i-j)>max)
          {
              max=Math.min(arr[i],arr[j])*Math.abs(i-j);
          }
          if(arr[i]<arr[j]) i++;
          else j--;
      }
      return max; 
    }
}
