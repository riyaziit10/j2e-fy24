/*
7. Implement a function to find the minimum height trees (MHTs) of a undirected graph, where an MHT is a root of the graph that has the minimum height among all possible roots. 
Example: Input: n = 6, edges = [[0,1],[0,2],[0,3],[3,4],[4,5]] Output: [3, 4]
*/
class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(edges.length == 0 || n == 1){
            List<Integer> res = Arrays.asList(0);
            return res;
        }
        ArrayList<Integer>[] adj = new ArrayList[n];
        int[] indegree = new int[n];
        
        for(int i=0; i<n; i++){
            adj[i] = new ArrayList<>();
        }
        
        for(int[] e: edges){
            int v = e[0];
            int u = e[1];
            
            adj[v].add(u);
            adj[u].add(v);
            indegree[u]++;
            indegree[v]++;
        }
        
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        
        for(int i=0; i<n; ++i){
            if(indegree[i] == 1){
                queue.add(i);
            }
        }
        
        while(n > 2){
            int size = queue.size();
            n -= size;
            
            while(size-- > 0){
                //remove
                int rem = queue.remove();
                
                //mark*
                //work
                for(int i: adj[rem]){
                    indegree[i]--;
                    if(indegree[i] == 1){
                        queue.add(i);
                    }
                }
                //add*
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        while(queue.size()>0){
            res.add(queue.pop());
        }
        
        
        return res;
    }
}

