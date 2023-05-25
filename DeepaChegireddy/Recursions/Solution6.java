import java.util.*;
public class Solution6 {
    static void subsetSums(int[] arr, int l, int r, int sum)
	{
		if (l > r) {
			System.out.print(sum + " ");
			return;
		}
		subsetSums(arr, l + 1, r, sum + arr[l]);
		subsetSums(arr, l + 1, r, sum);
	}
}
