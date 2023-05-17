/*

PROBLEM 9:

WRITE A CLASS STOCKSPANNER WHICH COLLECTS DAILY PRICE QUOTES FOR SOME STOCK, AND
RETURNS THE SPAN OF THAT STOCK'S PRICE FOR THE CURRENT DAY. THE SPAN OF THE STOCK'S PRICE TODAY IS
DEFINED AS THE MAXIMUM NUMBER OF CONSECUTIVE DAYS (STARTING FROM TODAY AND GOING BACKWARDS)
FOR WHICH THE PRICE OF THE STOCK WAS LESS THAN OR EQUAL TO TODAY'S PRICE.


Example input:
stockSpanner = StockSpanner()
stockSpanner.next(100) # returns 1
stockSpanner.next(80) # returns 1
stockSpanner.next(60) # returns 1
stockSpanner.next(70) # returns 2
stockSpanner.next(75) # returns 4
stockSpanner.next(85) # returns 6

Expected Time Complexity: O(n), where n is the number of calls to the next() method.
*/


import java.util.*;
public class Problem9 {
    private Stack<int[]> stack;
    
    public Problem9() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        while(!stack.isEmpty() && stack.peek()[0] <= price){
            span += stack.peek()[1];
            stack.pop();
        }
        stack.push(new int[]{price, span});
        return span;
    }
    public static void main(String[] args) {
        Problem9 stockSpanner = new Problem9();
        System.out.println(stockSpanner.next(100));
        System.out.println(stockSpanner.next(80)); 
        System.out.println(stockSpanner.next(60)); 
        System.out.println(stockSpanner.next(70)); 
        System.out.println(stockSpanner.next(75)); 
        System.out.println(stockSpanner.next(85)); 
    }
}

