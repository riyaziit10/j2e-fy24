import java.util.*;
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int s = 0;
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (s < 0) 
                s = arr[i];
            else 
                s += arr[i];
            if (s > maxVal)
                maxVal = s;
        }
        System.out.println(maxVal);
        sc.close();
    }
}

