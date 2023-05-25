public class Solution10 {
    public static int reverseBits(int n)
	{
		int rev = 0;
		while (n > 0) {
			rev <<= 1;
			if ((int)(n & 1) == 1)
				rev ^= 1;
			n >>= 1;
		}
		return rev;
	}
}
