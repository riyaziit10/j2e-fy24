import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int target = sc.nextInt();
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length ; i++) {
            for(int j = i + 1; j < arr.length; j++){
                for(int k = j + 1; k < arr.length; k++){
                    if (Math.abs(target - res) >Math.abs(target - (arr[i] + arr[j] + arr[k])))
                    res = arr[i] + arr[j] + arr[k];
                    } 
            }
        }
        System.out.println(res);
        sc.close();
    }
}
