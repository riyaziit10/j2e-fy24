public class problem10 {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices1 = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices1)); // Output: 7
        int[] prices2 = { 1, 2, 3, 4, 5 };
        System.out.println(maxProfit(prices2)); // Output: 4
        int[] prices3 = { 7, 6, 4, 3, 1 };
        System.out.println(maxProfit(prices3)); // Output: 0
    }
}
