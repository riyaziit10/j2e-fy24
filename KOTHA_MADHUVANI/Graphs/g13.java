import java.util.*;

public class g13 {
    public static void main(String[] args) {
        List<List<String>> tickets = new ArrayList<>();
        tickets.add(Arrays.asList("MUC", "LHR"));
        tickets.add(Arrays.asList("JFK", "MUC"));
        tickets.add(Arrays.asList("SFO", "SJC"));
        tickets.add(Arrays.asList("LHR", "SFO"));

        List<String> itinerary = reconstructItinerary(tickets);
        System.out.println("Reconstructed itinerary: " + itinerary);
    }

    public static List<String> reconstructItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> graph = new HashMap<>();
        List<String> itinerary = new ArrayList<>();

        // Build the graph from the given tickets
        for (List<String> ticket : tickets) {
            String from = ticket.get(0);
            String to = ticket.get(1);
            graph.computeIfAbsent(from, k -> new PriorityQueue<>()).offer(to);
        }

        dfs("JFK", graph, itinerary);

        // Reverse the itinerary to get the correct order
        Collections.reverse(itinerary);

        return itinerary;
    }

    private static void dfs(String airport, Map<String, PriorityQueue<String>> graph, List<String> itinerary) {
        PriorityQueue<String> destinations = graph.get(airport);

        while (destinations != null && !destinations.isEmpty()) {
            String nextAirport = destinations.poll();
            dfs(nextAirport, graph, itinerary);
        }

        itinerary.add(airport);
    }
}
