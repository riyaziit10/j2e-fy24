public class B10 {
    public long reverse(long a) {
        long result = 0;
        for (int i = 0; i < 32; i++) {
            if ((a & (1 << i)) != 0) {
                result |= (1L << (31 - i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        B10 solution = new B10();
        long a = 3;
        long result = solution.reverse(a);
        System.out.println(result);
    }
}
