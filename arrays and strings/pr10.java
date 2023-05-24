import java.util.*;
class pr10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            
            arr[i]=sc.nextInt();
        }
        
        System.out.print(maxProfit(arr));
        
    }
    public static int maxProfit(int[] arr) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        
        for (int price : arr) {
            minPrice = Math.min(minPrice, price);
            int todayProfit = price - minPrice;
            maxProfit = Math.max(maxProfit, todayProfit);
        }
        
        return maxProfit;
    }

}