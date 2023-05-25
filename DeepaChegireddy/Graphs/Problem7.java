import java.util.*;
public class Problem7 {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> result = new ArrayList<>();
        if(n <= 0 || edges == null) return result;
        if(n == 1){
            result.add(0);
            return result;
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++)
            map.put(i, new ArrayList<Integer>());
        for(int[] arr: edges){
            map.get(arr[0]).add(arr[1]);
            map.get(arr[1]).add(arr[0]);
        }
        int min = Integer.MAX_VALUE;
        LABEL:
        for(int i = 0; i < n; i++){
            boolean[] visited = new boolean[n];
            LinkedList<Integer> queue = new LinkedList<>();
            queue.offer(i);
            int count = 0;
            while(!queue.isEmpty()){
                count++;
                if(count > min) continue LABEL;
                int size = queue.size();
                for(int j = 0; j < size; j++){
                    int cur = queue.poll();
                    if(visited[cur]) continue;
                    visited[cur] = true;
                    queue.addAll(map.get(cur));
                }
            }
            if(count == min)
                result.add(i);
            else if(count < min){
                min = count;
                result.clear();
                result.add(i);
            }
        }
        return result;
    }
}
