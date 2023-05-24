/*
9. WRITE A CLASS STOCKSPANNER WHICH COLLECTS DAILY PRICE QUOTES FOR
SOME STOCK, AND RETURNS THE SPAN OF THAT STOCK'S PRICE FOR THE CURRENT
DAY. THE SPAN OF THE STOCK'S PRICE TODAY IS DEFINED AS THE MAXIMUM NUMBER
OF CONSECUTIVE DAYS (STARTING FROM TODAY AND GOING BACKWARDS) FOR
WHICH THE PRICE OF THE STOCK WAS LESS THAN OR EQUAL TO TODAY'S PRICE.
*/
import java.util.*;
class StocksSpanner {
private Stack<Integer> prices;
private Stack<Integer> spans;
public StocksSpanner() {
prices = new Stack<>();
spans = new Stack<>();
}
public int next(int price) {
int span = 1;
while (!prices.isEmpty() && prices.peek() <= price) {
prices.pop();
span += spans.pop();
}
prices.push(price);
spans.push(span);
return span;
}
}