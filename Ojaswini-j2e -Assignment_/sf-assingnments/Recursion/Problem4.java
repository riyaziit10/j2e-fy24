import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        toh(N, 1, 2, 3);
    }
    public static void toh(int N, int from, int to, int aux) {
        if(N == 1) {
            System.out.println("Move disk from rod " + from + " to rod " + to);
            return;
        }
        toh(N - 1, from, aux, to);
        System.out.println("Move disk from rod " + from + " to rod " + to);
        toh(N - 1, aux, to, from);
    }
}
