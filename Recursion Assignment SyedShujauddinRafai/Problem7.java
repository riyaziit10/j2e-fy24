import java.util.*;
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int profit[] = new int[N];
        int weight[] = new int[N];
        for(int i = 0; i < N; i++) {
            profit[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            weight[i] = sc.nextInt();
        }
        System.out.println(knapSack(N, W, profit, weight));
    }
    public static int knapSack(int N, int W, int[] profit, int[] weight) {
        if(N == 0 || W == 0) {
            return 0;
        }
        if(weight[N - 1] > W) {
            return knapSack(N - 1, W, profit, weight);
        }
        return Math.max(knapSack(N - 1, W, profit, weight), profit[N - 1] + knapSack(N - 1, W - weight[N - 1], profit, weight));
    }
}
