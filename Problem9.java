/*

Problem 9:

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are
adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.


Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]


Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]


Constraints:
● n == nums.length
● 1 <= n <= 300
● nums[i] is either 0, 1, or 2

*/


import java.util.*;
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int x = 0, y = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == 1){
                x++;
            }
            if(nums[i] == 2){
                y++;
            }
        }
        for(int i=0; i<n; i++){
            if(i < n - (x + y)){
                nums[i] = 0;
            }
            else if(i < n - y){
                nums[i] = 1;
            }
            else{
                nums[i] = 2;
            }
        }
        System.out.println(Arrays.toString(nums));
        sc.close();
    }
}
