import java.util.*;
public class sol3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(minCandies(arr));
        sc.close();
    }
    public static int minCandies(int[] arr) {
        int count = 0;
        Arrays.sort(arr);
        for(int i=arr.length - 1; i>=0; i--){
            while(arr[i] != arr[0])
            {
                arr[i]--;
                count++;
            }
        }
        return count;
    }    
}