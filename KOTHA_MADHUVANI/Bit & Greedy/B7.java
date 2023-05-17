import java.util.*;

public class B7 {
    public int findMinXor(ArrayList<Integer> A) {
        int n = A.size();
        Collections.sort(A);
        int min_xor = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int xor = A.get(i) ^ A.get(i + 1);
            min_xor = Math.min(min_xor, xor);
        }
        return min_xor;
    }

    public static void main(String[] args) {
        B7 s = new B7();
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(0, 2, 5, 7));
        System.out.println(s.findMinXor(A)); // expected output: 2

        A = new ArrayList<>(Arrays.asList(0, 4, 7, 9));
        System.out.println(s.findMinXor(A)); // expected output: 3
    }
}
