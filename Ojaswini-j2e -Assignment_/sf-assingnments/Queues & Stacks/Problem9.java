import java.util.*;
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StockSpanner stockSpanner = new StockSpanner();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            System.out.println(stockSpanner.next(x));
        }
        sc.close();
    }
}
class StockSpanner {
    Deque<Integer> prices;
    Deque<Integer> weights;
    public StockSpanner() {
        prices = new LinkedList<Integer>();
        weights = new LinkedList<Integer>();
    }
    public int next(int price) {
        int w = 1;
        while(!prices.isEmpty() && prices.peekFirst()<=price){
            prices.removeFirst();
            w += weights.removeFirst();
        }
        prices.addFirst(price);
        weights.addFirst(w);
        return w;
    }
}
