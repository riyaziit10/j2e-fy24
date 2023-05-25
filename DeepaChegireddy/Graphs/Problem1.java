import java.util.*;
public class Problem1{
    public static int length = 0;
    public static void dfs(int u,int[] vis,int[][] adj,int v,int e,int val){
        length = Math.max(length,val);
        vis[u] = 1;
        for(int i=0;i<adj[u].length;i++){
            if(adj[u][i] == 1 && vis[i] == 0) dfs(i,vis,adj,u,e,val+1);
        }
    }
    public static void helper(int v,int e,int[][] edges){
        int[][] adj = new int[v+1][v+1];
        for(int i=0;i<e;i++){
            adj[edges[i][0]][edges[i][1]] = 1;
            adj[edges[i][1]][edges[i][0]] = 1;
        }
        for(int i=1;i<v+1;i++){
            int[] vis = new int[v+1];
            Arrays.fill(vis,0);
            vis[i] = 1;
            int val = 0 ;
            dfs(i,vis,adj,v,e,val);
            
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int[][] edges = new int[e][2];
        for(int i=0;i<e;i++){
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }
        helper(v,e,edges);
        System.out.println(length);
    }
}
