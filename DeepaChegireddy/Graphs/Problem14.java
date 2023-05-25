import java.util.*;
public class Problem14 {
    public static int minSwaps(int[] nums)
	{
		int len = nums.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < len; i++)
			map.put(nums[i], i);

		Arrays.sort(nums);

		
		boolean[] visited = new boolean[len];
		Arrays.fill(visited, false);

		
		int ans = 0;
		for (int i = 0; i < len; i++) {

			
			if (visited[i] || map.get(nums[i]) == i)
				continue;

			int j = i, cycle_size = 0;
			while (!visited[j]) {
				visited[j] = true;

				
				j = map.get(nums[j]);
				cycle_size++;
			}

			
			if (cycle_size > 0) {
				ans += (cycle_size - 1);
			}
		}
		return ans;
	}
}
