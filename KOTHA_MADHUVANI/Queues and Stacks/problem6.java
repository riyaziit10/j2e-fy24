import java.util.Stack;

public class problem6 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (stack.isEmpty() || c == ')' && stack.pop() != '(' ||
                    c == ']' && stack.pop() != '[' || c == '}' && stack.pop() != '{') {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "()[]{}";
        boolean result = isValid(input);
        System.out.println(result); // Output: true

        input = "([)]";
        result = isValid(input);
        System.out.println(result); // Output: false
    }
}
