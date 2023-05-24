import java.util.*;

public class pr4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(); 
        int from =1;
        int to = n; 
        int aux = 2; 

        moveDisks(n, from, to, aux);
    }

    public static void moveDisks(int n, int from, int to, int aux) {
        if (n == 1) {
            System.out.println("Move disk from rod " + from + " to rod " + to);
            return;
        }
        moveDisks(n - 1, from, aux, to);
        System.out.println("Move disk from rod " + from + " to rod " + to);
        moveDisks(n - 1, aux, to, from);
    }
}