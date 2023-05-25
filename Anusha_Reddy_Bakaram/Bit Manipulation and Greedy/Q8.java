public class Q8 {
    public int single(int[] A) {
        int result = 0;
        for (int num : A) {
            result ^= num;
        }
        return result;
    }
    
}
