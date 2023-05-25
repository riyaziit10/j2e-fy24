import java.util.*;
class Solution1 {
    public static void printKLengthString(char set[], String sequence, int n, int k) {
        if (k == 0) {
            System.out.print(sequence + "\t");
            return;
        }
        for (int i = 0; i < n; i++) {
            String newSequence = sequence + set[i];
            printKLengthString(set, newSequence, n, k - 1);
        }
    }
}