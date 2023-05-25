class A10 {
    public int maxProfit(int[] prices) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>min){
                profit+=prices[i]-min;
            }
            
              
                min=prices[i];
            
            
        }
        return profit;
        
    }
}