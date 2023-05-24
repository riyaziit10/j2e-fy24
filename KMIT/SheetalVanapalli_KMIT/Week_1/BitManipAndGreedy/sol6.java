import java.util.*;
public class sol6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(singleNum(arr));
        sc.close();
    }
    public static int singleNum(int[] arr) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                count += (arr[j] >> i) & 1;
            }
            if (count % 3 != 0) {
                result |= (1 << i);
            }
        }
        return result;
    }
}