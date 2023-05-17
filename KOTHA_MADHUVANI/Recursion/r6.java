import java.util.*;

public class r6 {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5 };
        printSubsetSums(arr);
    }

    public static void printSubsetSums(int[] arr) {
        int n = arr.length;
        int totalSubsets = 1 << n;

        for (int i = 0; i < totalSubsets; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    sum += arr[j];
                }
            }
            System.out.print(sum + " ");
        }
    }
}
