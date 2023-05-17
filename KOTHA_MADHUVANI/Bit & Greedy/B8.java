import java.util.*;

public class B8 {
    public int singleNumber(final List<Integer> A) {
        int ones = 0, twos = 0;
        for (int i = 0; i < A.size(); i++) {
            ones = (ones ^ A.get(i)) & ~twos;
            twos = (twos ^ A.get(i)) & ~ones;
        }
        return ones;
    }

    public static void main(String[] args) {
        B8 solution = new B8();
        // List<Integer> A1 = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 1));
        // System.out.println(solution.singleNumber(A1)); // Output: 3
        List<Integer> A2 = new ArrayList<Integer>(Arrays.asList(1, 2, 2));
        System.out.println(solution.singleNumber(A2)); // Output: 1
    }
}
