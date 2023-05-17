/*
Problem 6:

Print sums of all subsets of a given set of size n.


Example 1:
Input: arr[] = {2, 3}
Output: 0 2 3 5

Example 2:
Input: arr[] = {2, 4, 5}
Output: 0 2 4 5 6 7 9 11


Constraints:
1 <= n <= 15
*/


import java.util.*;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printSubsetsSum(arr, n);
        sc.close();
    }

    public static void printSubsetsSum(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        List<Integer> subsetSums = new ArrayList<>();
        helper(arr, n, sum, 0, subsetSums);
        Collections.sort(subsetSums);
        for (int i = 0; i < subsetSums.size(); i++) {
            System.out.print(subsetSums.get(i) + " ");
        }
    }

    public static void helper(int[] arr, int n, int sum, int index, List<Integer> subsetSums) {
        if (index == n) {
            subsetSums.add(sum);
            return;
        }
        helper(arr, n, sum, index + 1, subsetSums);
        sum -= arr[index];
        helper(arr, n, sum, index + 1, subsetSums);
    }
}
