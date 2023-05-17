/*

Problem 2

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of
the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.

Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 


Example 2:
Input: height = [1,1]
Output: 1
 */

import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for(int i=0; i<n; i++){
            height[i] = sc.nextInt();
        }
        int left = 0;
        int right = n - 1;
        int maxArea = 0;
        while (left < right) {
            int currArea = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, currArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(maxArea);
        sc.close();
    }
}
    

