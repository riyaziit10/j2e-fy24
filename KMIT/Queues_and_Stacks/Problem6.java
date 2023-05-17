/*

PROBLEM 6:

GIVEN A STRING CONTAINING ONLY PARENTHESES, DETERMINE IF THE STRING IS VALID. AN INPUT STRING IS VALID IF:
● Open brackets must be closed by the same type of brackets.
● Open brackets must be closed in the correct order.


Example input: "()[]{}"
Expected output: True


Example input: "([)]"
Expected output: False
Expected Time Complexity: O(n), where n is the length of the input string.*/


import java.util.*;
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(validParentheses(s));
        sc.close();
    }
    public static boolean validParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}







