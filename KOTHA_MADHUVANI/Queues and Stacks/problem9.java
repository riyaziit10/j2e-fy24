import java.util.Stack;

public class problem9 {
    private Stack<int[]> stack;

    public problem9() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        stack.push(new int[] { price, span });
        return span;
    }

    public static void main(String[] args) {
        problem9 stockSpanner = new problem9();
        System.out.println(stockSpanner.next(100)); // returns 1
        System.out.println(stockSpanner.next(80)); // returns 1
        System.out.println(stockSpanner.next(60)); // returns 1
        System.out.println(stockSpanner.next(70)); // returns 2
        System.out.println(stockSpanner.next(75)); // returns 4
        System.out.println(stockSpanner.next(85)); // returns 6
    }
}
