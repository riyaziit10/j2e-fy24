/*

Question 7: Min XOR value

Given an integer array A of N integers, find the pair of integers in the array which have minimum XOR value. Report the
minimum XOR value.


Problem Constraints
2 <= length of the array <= 100000
0 <= A[i] <= 10^9


Input Format
First and only argument of input contains an integer array A.

Output Format
Return a single integer denoting minimum xor value.


Example Input
Input 1:
A = [0, 2, 5, 7]
Output 1:
2
Explanation 1:
0 xor 2 = 2


Input 2:
A = [0, 4, 7, 9]
Output 2:
3

*/

import java.util.*;
public class Problem7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(minXor(arr));
        sc.close();
    }
    public static int minXor(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int xor = arr[i] ^ arr[i+1];
            min = Math.min(min, xor);
        }
        return min;
    }
}
