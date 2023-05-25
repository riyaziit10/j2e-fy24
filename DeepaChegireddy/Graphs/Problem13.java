import java.util.*;
public class Problem13 {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, List<String>> map = new HashMap<>();
        for(List<String> ticket: tickets)
        {
            String start = ticket.get(0);
            String end = ticket.get(1);
            List<String> inner = map.getOrDefault(start, new ArrayList<>());
            inner.add(end);
            map.put(start,inner);
        }
        for(String s: map.keySet())
            Collections.sort(map.get(s));
        
        List<String> list = new ArrayList<>();
        helper(map,list,"JFK");
        
        return list;
    }
    public void helper(Map<String,List<String>> map, List<String> rst, String cur){
        List<String> nexts = map.get(cur);
        while(nexts!=null && nexts.size()>0)
        {
            String next = nexts.get(0);
            nexts.remove(0);
            helper(map,rst,next);
        }
        rst.add(0,cur);
    }
}
