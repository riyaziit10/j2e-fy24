import java.util.*;


public class pr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrangement = Cards(n);
        for (int i = 0; i < n; i++) {
            System.out.print(arrangement[i] + " ");
        }
    }
    public static int[] Cards(int n){
        int[] deck = new int[n];
        for (int i = 0; i < n; i++) {
            deck[i] = i + 1;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.offer(deck[i]);
        }
        int[] arrangement = new int[n];
        int i = 1, j = 0;
        while (!q.isEmpty()) {
            for (int k = 0; k < i; k++) {
                q.offer(q.poll());
            }
            arrangement[j++] = q.poll();
            i++;
        }
        for (int k = 0; k < n; k++) {
            if (arrangement[k] == 0) {
                return new int[]{-1};
            }
        }
        return arrangement;
    }
}
