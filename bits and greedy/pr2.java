import java.util.*;
public class pr2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int amt=sc.nextInt();
        System.out.println(coinChange(arr,amt));

    }
    public static int coinChange(int[] coins, int amount) {
        
        if (amount == 0) {
            return amount;
        }
        
        if (coins.length == 1) {    
            if (amount % coins[0] == 0) {
                return amount / coins[0];
            } else {
                return -1;
            }
        }
   
        Arrays.sort(coins); 
        
        int numberOfWays = 0; 
        
        for (int i = coins.length - 1; i >= 0; i--) {
            if (coins[i] <= amount) {
                numberOfWays += (amount / coins[i]); 
                amount -= (coins[i] * (amount / coins[i]));
            }
        }
         
        return numberOfWays == 0 ? -1 : numberOfWays;
    }
}