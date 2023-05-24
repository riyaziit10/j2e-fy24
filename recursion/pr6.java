import java.util.*;
public class pr6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        subsetSums(arr, 0, n - 1, 0);
    }

    public static void subsetSums(int[] arr, int l, int r, int sum)
    {
        if (l > r) {
            System.out.print(sum + " ");
            return;
        }
        subsetSums(arr, l + 1, r, sum + arr[l]);
        subsetSums(arr, l + 1, r, sum);
    }

}