import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = {'a', 'b', 'c', 'd'};
        int k = sc.nextInt();
        printAllKLength(arr, k);
    }
    public static void printAllKLength(char[] arr, int k) {
        int n = arr.length;
        printAllKLengthRec(arr, "", n, k);
    }
    public static void printAllKLengthRec(char[] arr, String prefix, int n, int k) {
        if(k == 0) {
            System.out.println(prefix);
            return;
        }
        for(int i = 0; i < n; i++) {
            String newPrefix = prefix + arr[i];
            printAllKLengthRec(arr, newPrefix, n, k - 1);
        }
    }
}
