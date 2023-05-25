public class Q9 {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int cnt = 0;
    
        while (xor != 0) {
            if ((xor & 1) == 1) {
                cnt++;
            }
            xor >>= 1;
        }
    
        return cnt;
    }
    
}
