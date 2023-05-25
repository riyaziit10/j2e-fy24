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
    public static int coinChange(int[] arr, int amt) {
        
        if (amt == 0) {
            return amt;
        }
        
        if (arr.length == 1) {    
            if (amt % arr[0] == 0) {
                return amt / arr[0];
            } else {
                return -1;
            }
        }
        Arrays.sort(arr); 
        int ways = 0; 
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] <= amt) {
                ways += (amt / arr[i]); 
                amt -= (arr[i] * (amt / arr[i]));
            }
        }
         
        return ways == 0 ? -1 : ways;
    }
}