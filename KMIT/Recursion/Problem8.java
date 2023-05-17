/*
Problem 8:

Given a string s, partition s such that every string of the partition is a palindrome. Return all possible palindrome partitioning
of s.


Example 1:
Input: s = "bcc"
Output: [["b", "c", "c"], ["b", "cc"]]


Example 2:
Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]


Constraints:
1 <= s.length <= 16
s contains only lowercase English letters.
*/


import java.util.*;
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(partition(s));
        sc.close();
    }
    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<String>(), result);
        return result;
    }
    
    private static void backtrack(String s, int start, List<String> temp, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<String>(temp));
        } else {
            for (int i = start; i < s.length(); i++) {
                if (isPalindrome(s, start, i)) {
                    temp.add(s.substring(start, i + 1));
                    backtrack(s, i + 1, temp, result);
                    temp.remove(temp.size() - 1);
                }
            }
        }
    }
    
    private static boolean isPalindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low++) != s.charAt(high--)) {
                return false;
            }
        }
        return true;
    }
}
