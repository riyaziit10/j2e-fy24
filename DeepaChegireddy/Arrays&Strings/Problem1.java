import java.util.Arrays;
import java.util.Scanner;

class Problem1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int maxVal = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            maxVal = Math.max(maxVal,arr[i]);
        }
        int extra = sc.nextInt();
        boolean[] res =  new boolean[n];
        for(int i=0;i<n;i++){
            if (arr[i]+extra >= maxVal){
                res[i] = true;
            }
        }
        System.out.println(Arrays.toString(res));
        sc.close();
}
}