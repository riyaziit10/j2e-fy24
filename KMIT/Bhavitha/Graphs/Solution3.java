/*
3. Implement a function to clone a directed graph, where each node contains a label and a list of its neighbors. 
Example: Input: graph = [[1,2],[2,3],[3,4],[4,5],[5,1]] Output: [[1,2],[2,3],[3,4],[4,5],[5,1]]
*/
import java.util.*;
 
class GFG{
 static class Node
{
    int key;
    ArrayList<Node> adj = new ArrayList<Node>();
    
    Node(int key)
    {
        this.key = key;
    }
}
static void printGraph(Node startNode,
                       boolean[] visited)
{
    if (!startNode.adj.isEmpty())
    {
        for(Node i : startNode.adj)
        {
            if (!visited[startNode.key])
            {
                System.out.println("edge " + startNode +
                             "-" + i + ":" + startNode.key +
                             "-" + i.key);
                 
                if (!visited[i.key])
                {
                    printGraph(i, visited);
                    visited[i.key] = true;
                }
            }
        }
    }
}
static Node cloneGraph(Node oldSource,
                       Node newSource,
                       boolean[] visited)
{
    Node clone = null;
     
    if (!visited[oldSource.key] &&
        !oldSource.adj.isEmpty())
    {
        for(Node old : oldSource.adj)
        {
            if (clone == null ||
               (clone != null &&
                clone.key != old.key))
                clone = new Node(old.key);
                 
            newSource.adj.add(clone);
            cloneGraph(old, clone, visited);
            visited[old.key] = true;
        }
    }
    return newSource;
}

