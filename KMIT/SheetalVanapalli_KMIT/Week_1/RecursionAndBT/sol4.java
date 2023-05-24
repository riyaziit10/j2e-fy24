import java.util.*;
public class sol4 {
    
    public static void solveHanoi(int n, int from, int to, int aux) {
        if (n == 1) {
            System.out.println("Move disk from rod " + from + " to rod " + to);
            return;
        }
        solveHanoi(n-1, from, aux, to);
        System.out.println("Move disk from rod " + from + " to rod " + to);
        solveHanoi(n-1, aux, to, from);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solveHanoi(n, 1, 3, 2);
        sc.close();
    }
}