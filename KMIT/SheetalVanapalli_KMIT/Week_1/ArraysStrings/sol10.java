public class sol10 {
    static int maxProfit(int []arr){
        int n = arr.length;
        int []dp = new int[n];
        dp[0]=0;
        for(int i=1;i<n;i++){
            dp[i] = dp[i-1] + Math.max(arr[i]-arr[i-1],0);

        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        int []arr={7,1,5,3,6,4} ;
        System.out.println(maxProfit(arr)); 
    }
    
}
