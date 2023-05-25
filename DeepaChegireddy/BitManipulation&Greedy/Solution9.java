import java.util.*;

public class Solution9 {
    static int hammingDistance(int x, int y)
{
	int ans = 0;
	int m = Math.max(x, y);
	while (m>0) {
		int c1 = x & 1;
		int c2 = y & 1;
		if (c1 != c2)
			ans += 1;
		m = m >> 1;
		x = x >> 1;
		y = y >> 1;
	}
	return ans;
}
}


