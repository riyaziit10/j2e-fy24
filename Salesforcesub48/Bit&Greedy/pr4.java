import java.util.*;

public class pr4 {

    public static int minPillsToSurvive(int N, int V, int[] a) {
        int pillsNeeded = 0;
        int health = V;

        Arrays.sort(a);

        for (int i = 0; i < N; i++) {
            if (a[i] > 1 && health <= a[i] - 1) {
                pillsNeeded++;
                health = a[i];
            }
            else if (a[i] == 1 && health <= 1) {
                pillsNeeded++;
                health = 2;
            }
        }

        return pillsNeeded;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result = minPillsToSurvive(n, v, arr);
        System.out.println(result);
    }
}
