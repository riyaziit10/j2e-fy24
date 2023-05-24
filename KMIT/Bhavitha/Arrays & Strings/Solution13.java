/*
Given a binary array nums, return the maximum number of consecutive 1's in the array.
 
Example 1:
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:
Input: nums = [1,0,1,1,0,1]
Output: 2
*/
class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int ct=0;
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
            if(arr[i]==1)
            {
                ct++;
            }
            else
            {
                System.out.println(ct);
                ans=Math.max(ans,ct);
                ct=0;
            }
        }
        ans=Math.max(ans,ct);
        return ans;
    }
}
