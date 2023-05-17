public class r4 {
    public static void main(String[] args) {
        int N = 3;
        moveDisks(N, 1, 3, 2);
    }

    public static void moveDisks(int N, int source, int destination, int auxiliary) {
        if (N == 1) {
            System.out.println("Move disk from rod " + source + " to rod " + destination);
            return;
        }

        moveDisks(N - 1, source, auxiliary, destination);
        System.out.println("Move disk from rod " + source + " to rod " + destination);
        moveDisks(N - 1, auxiliary, destination, source);
    }
}
