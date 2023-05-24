/*
9. Implement a function to find the number of paths in a directed acyclic graph (DAG) from the source node to the destination node. 
Example: Input: graph = [[0,1],[0,2],[1,2],[1,3],[2,3]] source = 0, destination = 3 Output: 2
*/
import java.util.*;
 
class solution{
static final int MAXN = 1000005;
static Vector<Integer> []v = new Vector[MAXN];
static {
    for (int i = 0; i < v.length; i++)
        v[i] = new Vector<Integer>();
}
static void add_edge(int a, int b, int fre[])
{
    v[a].add(b);
    fre[b]++;
}
static Vector<Integer> topological_sorting(int fre[], int n)
{
    Queue<Integer> q = new LinkedList<Integer>();
    for (int i = 0; i < n; i++)
        if (fre[i]==0)
            q.add(i);
 
    Vector<Integer> l = new Vector<Integer>();
    while (!q.isEmpty()) {
        int u = q.peek();
        q.remove();
        l.add(u);
        for (int i = 0; i < v[u].size(); i++) {
            fre[v[u].get(i)]--;
            if (fre[v[u].get(i)]==0)
                q.add(v[u].get(i));
        }
    }
    return l;
}
static int numberofPaths(int source, int destination, int n, int fre[])
{
    Vector<Integer> s = topological_sorting(fre, n);
    int dp[] = new int[n];
    dp[destination] = 1;
    for (int i = s.size() - 1; i >= 0; i--) {
        for (int j = 0; j < v[s.get(i)].size(); j++) {
            dp[s.get(i)] += dp[v[s.get(i)].get(j)];
        }
    }
 
    return dp;
}
