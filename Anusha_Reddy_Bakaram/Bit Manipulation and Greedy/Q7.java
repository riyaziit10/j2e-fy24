import java.util.*;
public class Q7 {
    public int MinXor(int[] A) {
        Arrays.sort(A);
        int minXor = Integer.MAX_VALUE;
    
        for (int i = 0; i < A.length - 1; i++) {
            minXor = Math.min(minXor, A[i] ^ A[i + 1]);
        }
    
        return minXor;
    }
    
}
