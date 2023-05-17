/*

Problem 11:

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return
the index to any of the peaks.


Example 1:
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.


Example 2:
Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2


Constraints
● 1 <= nums.length <= 1000
● -231 <= nums[i] <= 231 - 1
● nums[i] != nums[i + 1] for all valid i.

*/


import java.util.*;
public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(findPeakElement(nums));
        sc.close();
    }
    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        } 
        return left;
    }
}


