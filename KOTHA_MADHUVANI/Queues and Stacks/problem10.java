import java.util.Stack;

public class problem10 {
    public static int evalRPN(String[] tokens) {
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

    public static void main(String[] args) {
        String[] tokens1 = { "2", "1", "+", "3", "*" };
        System.out.println(evalRPN(tokens1)); // expected output: 9

        String[] tokens2 = { "4", "13", "5", "/", "+" };
        System.out.println(evalRPN(tokens2)); // expected output: 6
    }
}
