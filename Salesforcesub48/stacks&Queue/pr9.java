import java.util.Stack;

class pr9 {
    private Stack<int[]> stack;

    public pr9() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        
        while (!stack.isEmpty() && price >= stack.peek()[0]) {
            span += stack.pop()[1];
        }
        
        stack.push(new int[]{price, span});
        
        return span;
    }

    public static void main(String[] args) {
        pr9 stockSpanner = new pr9();
        System.out.println(stockSpanner.next(100)); 
        System.out.println(stockSpanner.next(80));  
        System.out.println(stockSpanner.next(60));  
        System.out.println(stockSpanner.next(70));  
        System.out.println(stockSpanner.next(75));  
        System.out.println(stockSpanner.next(85));  
    }
}
