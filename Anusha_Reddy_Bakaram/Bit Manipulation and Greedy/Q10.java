public class Q10 {
    public long reverseBits(long A) {
        long reversedBits = 0;
        int numBits = 32;
        
        for (int i = 0; i < numBits; i++) {
            long bit = (A >> i) & 1;
            reversedBits |= (bit << (numBits - 1 - i));
        }
        
        return reversedBits;
    }
    
}
