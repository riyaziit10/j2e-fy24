public class Q6 {
    public int OneTime(int[] nums) {
        int ones = 0;
        int twos = 0;
    
        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
    
        return ones;
    }
    
}
