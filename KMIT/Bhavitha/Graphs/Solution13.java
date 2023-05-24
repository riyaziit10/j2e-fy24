/*
13. Given a list of airline tickets represented as pairs of origin and destination airports, implement a function to reconstruct the itinerary in order, assuming that the itinerary starts from "JFK". Example: Input: tickets = [["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]] Output: ["JFK", "MUC", "LHR", "SFO", "SJC"]
*/
class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String,List<String>> hm=new HashMap<>();
        for(List<String> i:tickets)
        {
            List<String> a=i;
            if(!hm.containsKey(a.get(0)))
            {
                List<String> al=new ArrayList<>();
                al.add(a.get(1));
                Collections.sort(al);
                hm.put(a.get(0),al);
            }
            else
            {
               List<String> ab=hm.get((a.get(0)));
               hm.remove(a.get(0));
               ab.add(a.get(1));
               Collections.sort(ab);
               hm.put(a.get(0),ab);  
            }
        }
        System.out.println(hm);
       
        Stack<String> st=new Stack<>();
        st.push("JFK");//fixing first element as "JFK"
        List<String> ans=new ArrayList<>();
       
        while(st.size()!=0)
        {
          String w=st.peek(); 
        if(hm.containsKey(w))
        { 
            
         List<String> al=hm.get(w);
        
        if(al.size()>0)  
        {
            st.push(al.get(0));
            al.remove(0);
        }
        else 
        {
            
            hm.remove(w);
            ans.add(st.pop());
        }
        }
        else
        {
            ans.add(st.pop());
        }
        }
        System.out.println(ans);
        Collections.reverse(ans);
        return ans;

    }
}

