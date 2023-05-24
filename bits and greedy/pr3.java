import java.util.*;
public class pr3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        Arrays.sort(arr);
        int min=arr[0];
        for(int i=0;i<n;i++){
            sum+=arr[i]-min;
        }
        System.out.println(sum);
    }
}