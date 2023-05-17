import java.util.*;

public class B3 {

    public static int minCandiesToEat(int[] a) {
        int n = a.length;
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            max = Math.max(max, a[i]);
        }
        int minCandies = 0;
        for (int i = max; i <= sum; i++) {
            int candiesToEat = 0;
            for (int j = 0; j < n; j++) {
                candiesToEat += (i - a[j]);
            }
            if (candiesToEat <= i - max) {
                minCandies = candiesToEat;
                break;
            }
        }
        return minCandies;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int minCandies = minCandiesToEat(a);
        System.out.println(minCandies);
        sc.close();
    }
}
