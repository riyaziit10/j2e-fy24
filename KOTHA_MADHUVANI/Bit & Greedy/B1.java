import java.util.*;

public class B1 {

    public static int countSteps(int N, int[] A) {
        Map<Integer, Integer> weightCount = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int weight = A[i];
            weightCount.put(weight, weightCount.getOrDefault(weight, 0) + 1);
        }
        return weightCount.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int steps = countSteps(N, A);
        System.out.println(steps);
        sc.close();
    }
}
