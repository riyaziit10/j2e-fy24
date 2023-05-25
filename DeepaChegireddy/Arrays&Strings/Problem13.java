import java.util.*;
public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int p1 = 0, p2 = n-1;
        int maxVal = Integer.MIN_VALUE;
        while(p1<p2){
            int height = Math.min(arr[p1],arr[p2]);
            int width = p2-p1;
            int area = height * width;
            maxVal = Math.max(maxVal,area);
            if (arr[p1]<arr[p2])
                p1++;
            else if (arr[p2]<arr[p1])
                p2--;
            else{
                p1++;
                p2--;
            }
        }
        System.out.println(maxVal);
        sc.close();
    }
}
