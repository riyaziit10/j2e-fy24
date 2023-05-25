
import java.util.*;

class  R6{
	public static void subsetSums(List<Integer>ls,int[] arr, int i, int n, int sum)
	{
		if (i>=n) {
			ls.add(sum);
			return;
		}
		subsetSums(ls,arr, i+ 1, n, sum +arr[i]);
		subsetSums(ls,arr, i+ 1, n, sum);
	}

	public static List<Integer> subSetSum(int arr[])
	{
int n=arr.length;
List<Integer>ls=new ArrayList<>();
		subsetSums(ls,arr, 0, n , 0);
        return ls;
	}
}

