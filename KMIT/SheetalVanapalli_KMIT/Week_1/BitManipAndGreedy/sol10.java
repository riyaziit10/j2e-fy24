import java.util.*;
public class sol10 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        System.out.println(reverseBits(x));
        sc.close();
    }
    public static long reverseBits(long x) {
        long result = 0;
        for (int i = 0; i < 32; i++) {
            result = result << 1;
            result |= (x & 1);
            x = x >> 1;
        }
        return result;
    }
}