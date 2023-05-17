/*

PROBLEM 3:

GIVEN AN ARRAY ARR[] OF SIZE N AND AN INTEGER K. FIND THE MAXIMUM FOR EACH AND EVERY CONTIGUOUS SUBARRAY OF SIZE K.


Example 1:
Input:
N = 9, K = 3
arr[] = 1 2 3 1 4 5 2 3 6
Output:
3 3 4 5 5 5 6
Explanation:
1st contiguous subarray = {1 2 3} Max = 3
2nd contiguous subarray = {2 3 1} Max = 3
3rd contiguous subarray = {3 1 4} Max = 4
4th contiguous subarray = {1 4 5} Max = 5
5th contiguous subarray = {4 5 2} Max = 5
6th contiguous subarray = {5 2 3} Max = 5
7th contiguous subarray = {2 3 6} Max = 6


Example 2:
Input:
N = 10, K = 4
arr[] = 8 5 10 7 9 4 15 12 90 13
Output:
10 10 10 15 15 90 90Explanation: 1st contiguous subarray = {8 5 10 7}, Max = 10
2nd contiguous subarray = {5 10 7 9}, Max = 10
3rd contiguous subarray = {10 7 9 4}, Max = 10
4th contiguous subarray = {7 9 4 15}, Max = 15
5th contiguous subarray = {9 4 15 12},
Max = 15
6th contiguous subarray = {4 15 12 90},
Max = 90
7th contiguous subarray = {15 12 90 13},
Max = 90


Your Task:
Write a function which takes the array, N and K as input parameters and returns a list of integers denoting the maximum of
every contiguous subarray of size K.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(k)


Constraints:
1 ≤ N ≤ 10^5
1 ≤ K ≤ N
0 ≤ arr[i] ≤ 10^7

*/


import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] res = maxInSubarray(arr, k);
        for(int i=0; i<n; i++){
            System.out.println(res[i]);
        }
        sc.close();
    }
    public static int[] maxInSubarray(int[] arr, int k) {
        int n = arr.length;
        Queue<Integer> queue = new LinkedList<>(); 
        int[] ans = new int[n - k + 1]; 
        int j = 0; 
        for (int i = 0; i < n; i++) {
            while (!queue.isEmpty() && queue.peek() < j) {
                queue.poll();
            }
            while (!queue.isEmpty() && arr[i] > arr[queue.peek()]) {
                queue.poll();
            }
            queue.offer(i); 
            if (i - j + 1 == k) {
                ans[j] = arr[queue.peek()];
                if (queue.peek() == j) {
                    queue.poll();
                }
                j++; 
            }
        }
        return ans;
    }
}
