/*
Problem 3:

Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to
target.
Return the sum of the three integers.
You may assume that each input would have exactly one solution.


Example 1:
Input: nums = [-1,2,1,-4],
target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).


Example 2:
Input: nums = [0,0,0],
target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0). 
*/


import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE / 2;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println(closestSum);
        sc.close();
    }
}



