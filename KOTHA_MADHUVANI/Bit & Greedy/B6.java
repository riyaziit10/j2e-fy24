import java.util.*;

public class B6 {
    public int singleNumber(final List<Integer> A) {
        int ones = 0, twos = 0, threes = 0;
        for (int i = 0; i < A.size(); i++) {
            twos |= ones & A.get(i);
            ones ^= A.get(i);
            threes = ones & twos;
            ones &= ~threes;
            twos &= ~threes;
        }
        return ones;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(0, 0, 0, 1));
        B6 b6 = new B6();
        int uniqueNum = b6.singleNumber(nums);
        System.out.println("The unique number in the list is: " + uniqueNum);
    }
}
