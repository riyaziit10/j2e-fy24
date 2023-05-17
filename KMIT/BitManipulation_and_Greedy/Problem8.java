/*

Question 8: Single Integer II

Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.

NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?


Problem Constraints
1 <= |A| <= 2000000
0 <= A[i] <= INTMAX


Input Format
The first and only argument of input contains an integer array A.
Output Format
Return a single integer denoting the single element.


Example Input
Input 1:
A = [1, 2, 2, 3, 1]
Output 1:
3
Explanation:
3 occurs once.


Input 2:
A = [1, 2, 2]
Output 2:
1
Explanation:
1 occurs once.

*/


import java.util.*;
public class Problem8 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(singleNum(arr));
        sc.close();
    }
    public static int singleNum(int[] arr) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                count += (arr[j] >> i) & 1;
            }
            if (count % 2 != 0) {
                result |= (1 << i);
            }
        }
        return result;
    }
}
