import java.util.*;
public class pr7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int val=0;
        for(int i=0;i<n-1;i++){
            val=arr[i]^arr[i+1];
            min=Math.min(val,min);
        }
        System.out.println(min);
    }
}