import java.util.*;

public class problem8 {
    public static String removeAdjacentDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.empty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    public static String removeDuplicatesLexi(String s) {
        String result = removeAdjacentDuplicates(s);
        char[] chars = result.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicatesLexi(s)); // ca
    }
}
