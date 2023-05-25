import java.util.*;


public class pr10 {
    public static long reverseBits(long A) {
        long result = 0;

        for (int i = 0; i < 32; i++) {
            result <<= 1;

            if ((A & 1) == 1) {
                result |= 1;
            }

            A >>= 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long A=sc.nextInt();
        long result = reverseBits(A);
        System.out.println("Reversed bits: " + result);
    }
}
