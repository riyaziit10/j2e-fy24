/*

Question 6: Single Number

Given an array of integers, every element appears thrice except for one, which occurs once.
Find that element that does not appear thrice.

NOTE: Your algorithm should have a linear runtime complexity.
Could you implement it without using extra memory?


Problem Constraints
2 <= A <= 5*10^6
0 <= A <= INTMAX


Input Format
First and only argument of input contains an integer array A.

Output Format
Return a single integer.


Example Input
Input 1:
A = [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]
Output 1:
4
Explanation:
4 occurs exactly once in Input 1.


Input 2:
A = [0, 0, 0, 1]
Output 2:
1
Explanation:
1 occurs exactly once in Input 2.

*/


import java.util.*;
public class Problem6 {
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
            if (count % 3 != 0) {
                result |= (1 << i);
            }
        }
        return result;
    }
}
