/*

PROBLEM 10:

EVALUATE THE VALUE OF AN ARITHMETIC EXPRESSION IN REVERSE POLISH NOTATION (RPN). VALID
OPERATORS ARE +, -, *, AND /. EACH OPERAND MAY BE AN INTEGER OR ANOTHER EXPRESSION.


Example input: ["2", "1", "+", "3", "*"]
Expected output: 9


Example input: ["4", "13", "5", "/", "+"]
Expected output: 6

Expected Time Complexity: O(n), where n is the length of the input list.
*/


import java.util.*;
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tokens = sc.nextLine().split(",");
        System.out.println(Evaluate(tokens));
        sc.close();
    }
    public static int Evaluate(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+")) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                stack.push(operand1 + operand2);
            } else if (token.equals("-")) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                stack.push(operand1 - operand2);
            } else if (token.equals("*")) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                stack.push(operand1 * operand2);
            } else if (token.equals("/")) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                stack.push(operand1 / operand2);
            } else {
                int operand = Integer.parseInt(token);
                stack.push(operand);
            }
        }
        return stack.pop();
    }
}


