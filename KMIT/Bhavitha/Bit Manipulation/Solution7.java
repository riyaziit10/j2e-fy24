/*
Question 7: Min XOR value Problem Description Given an integer array A of N integers, find the pair of integers in the array which have minimum XOR value. Report the minimum XOR value.
 Problem Constraints 2 <= length of the array <= 100000 0 <= A[i] <= 10 9 
Input Format First and only argument of input contains an integer array A. 
Output Format Return a single integer denoting minimum xor value. 
Example Input Input 1:  A = [0, 2, 5, 7] Input 2:  A = [0, 4, 7, 9]
 Example Output Output 1: 2
 
//Time Complexity: O(N*logN) 
//Space Complexity: O(1) 
*/
class Solution{

    static int minxorpair(int N, int arr[]){
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<N-1;i++)
        {
            min=Math.min(arr[i]^arr[i+1],min);
        }
        return min;
    }
