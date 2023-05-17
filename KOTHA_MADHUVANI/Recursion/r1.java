import java.util.*;

public class r1 {
    public static void main(String[] args) {
        char[] set = { 'a', 'b', 'c', 'd' };
        int k = 3;
        printPossibleStrings(set, k);
    }

    public static void printPossibleStrings(char[] set, int k) {
        int n = set.length;
        generateStrings(set, "", n, k);
    }

    public static void generateStrings(char[] set, String prefix, int n, int k) {
        if (k == 0) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < n; i++) {
            String newPrefix = prefix + set[i];
            generateStrings(set, newPrefix, n, k - 1);
        }
    }
}
