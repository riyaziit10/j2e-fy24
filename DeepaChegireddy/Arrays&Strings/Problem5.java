import java.util.Scanner;

public class Problem5 {
    public static int find(int[] arr, int key) {
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        while(low<=high){
            mid = low + (high-low)/2;
            if (arr[mid]==key)
                return mid;
            if (arr[low]<= arr[mid]){
                if (key >= arr[low] && key <= arr[mid] )
                    high = mid -1;
                else
                    low = mid + 1;
            }
            else{
                if (key >= arr[mid] && key <= arr[high] )
                    low = mid + 1;
                else
                    high = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int key = sc.nextInt();
        System.out.println(find(arr,key));
        sc.close();
    }
}
