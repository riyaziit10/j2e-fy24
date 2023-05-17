/*
PROBLEM 8:

GIVEN A STRING S CONSISTING OF LOWERCASE LETTERS, REMOVE ADJACENT DUPLICATES FROM S.
THE FINAL OUTPUT SHOULD BE IN LEXICOGRAPHICALLY SMALLEST ORDER.


Example input: "abbaca"
Expected output: "ca"

Expected Time Complexity: O(n), where n is the length of the input string
*/

import java.util.*;
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeAdjDuplicates(s));
        sc.close();
    }
    public static String removeAdjDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
