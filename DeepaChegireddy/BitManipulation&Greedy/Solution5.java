import java.util.*;
public class Solution5 {
    public static List<List<Integer> >
	solve(List<Integer> v)
{
	Set<List<Integer> > res = new HashSet<>();
	List<Integer> subset = new ArrayList<>();
	List<List<Integer> > result = new ArrayList<>();
	res.add(subset);
	for (int i = 0; i < v.size(); i++) {
	int N = res.size();
	for (List<Integer> it : res) {
		subset = new ArrayList<>(it);
		subset.add(v.get(i));
		result.add(subset);
		N--;
		if (N == 0) {
		break;
		}
	}
	res.addAll(result);
	result.clear();
	}

	return new ArrayList<>(res);
}
     
}
