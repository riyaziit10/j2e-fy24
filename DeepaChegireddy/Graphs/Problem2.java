
import java.util.*;
public class Problem2 {
    public static int swap(int[] arr,int n){
        List<int[]> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new int[]{arr[i],i});
        }
        Collections.sort(list,(a,b)->a[0]-b[0]);
        System.out.println(list);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(swap(arr,n));
    }
}



