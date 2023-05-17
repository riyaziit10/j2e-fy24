/*
Question 1:

You are given N fruits.
The weight of the fruits is represented by an array A.
All those fruits which have the same weight can be sliced in one step.

Task:
Your task is to determine the number of steps to slice all the fruits.


Example 1:
Input: N = 4, A = [3, 6, 7, 7]
Output: 3


Example 2:
Input: N = 6, A = [20, 40, 30, 50, 40, 20]
Output: 4


*/

import java.util.*;
public class Problem1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(calcSteps(arr));
        sc.close();
    }
    public static int calcSteps(int[] arr) {
        Set<Integer> hs = new HashSet<Integer>();
        for (int weight : arr) {
            hs.add(weight);
        }
        return hs.size();
    }
}

