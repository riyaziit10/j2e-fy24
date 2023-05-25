
import java.util.*;
public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] tickets = new String[n][2];
        for(int i = 0; i < n; i++) {
            tickets[i][0] = sc.next();
            tickets[i][1] = sc.next();
        }
        HashMap<String, ArrayList<String>> graph = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if(!graph.containsKey(tickets[i][0])) {
                graph.put(tickets[i][0], new ArrayList<>());
            }
            graph.get(tickets[i][0]).add(tickets[i][1]);
        }
        for(String key : graph.keySet()) {
            Collections.sort(graph.get(key));
        }
        ArrayList<String> result = new ArrayList<>();
        dfs(graph, "JFK", result);
        System.out.println(result);
    }
    public static void dfs(HashMap<String, ArrayList<String>> graph, String source, ArrayList<String> result) {
        while(graph.containsKey(source) && graph.get(source).size() > 0) {
            String destination = graph.get(source).remove(0);
            dfs(graph, destination, result);
        }
        result.add(0, source);
    }
}
