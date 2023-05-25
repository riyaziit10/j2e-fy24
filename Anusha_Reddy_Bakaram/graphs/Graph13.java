import java.util.*;

public class Graph13 {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> graph = buildGraph(tickets);
        List<String> itinerary = new ArrayList<>();
        dfs("JFK", graph, itinerary);
        Collections.reverse(itinerary);
        return itinerary;
    }

    private Map<String, PriorityQueue<String>> buildGraph(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> graph = new HashMap<>();
        for (List<String> ticket : tickets) {
            String origin = ticket.get(0);
            String destination = ticket.get(1);
            graph.putIfAbsent(origin, new PriorityQueue<>());
            graph.get(origin).offer(destination);
        }
        return graph;
    }

    private void dfs(String airport, Map<String, PriorityQueue<String>> graph, List<String> itinerary) {
        PriorityQueue<String> destinations = graph.get(airport);
        while (destinations != null && !destinations.isEmpty()) {
            String nextAirport = destinations.poll();
            dfs(nextAirport, graph, itinerary);
        }
        itinerary.add(airport);
    }
}
