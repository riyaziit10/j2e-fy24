import java.util.*;
class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int a = m + n - 2;
        int b = m - 1;
        double r = 1;
        for (int i = 1; i <= b; i++) {
            r = r * (a - b + i) / i;
        }
        System.out.println((int) r);

    }
}

