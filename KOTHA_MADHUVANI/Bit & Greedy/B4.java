public class B4 {

    public static int minPills(int N, int V, int[] a) {
        int minPills = 0;
        int currentHealth = V;

        for (int i = 0; i < N; i++) {
            if (currentHealth <= 0) {
                break;
            }

            if (a[i] > currentHealth) {
                minPills++;
                currentHealth++;
            }

            currentHealth -= a[i];
            minPills++;
        }

        return (currentHealth <= 0) ? minPills - 1 : -1;
    }

    public static void main(String[] args) {
        int N = 5;
        int V = 2;
        int[] a = { 1, 3, 1, 1, 3 };

        int minPills = minPills(N, V, a);

        System.out.println("Minimum pills required to survive: " + (minPills - 1));
    }
}
