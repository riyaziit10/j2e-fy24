import java.util.*;
class Q8{
    public String removeDuplicates(String s) {
        Stack<Character>st = new Stack();
        if(s.length()<=1){return s;}
          st.add(s.charAt(0));
        for(int i=1;i<s.length();i++){
          
            if(!st.isEmpty() && st.peek().equals(s.charAt(i))){
                st.pop();
                continue;
            }
            st.add(s.charAt(i));
        }
        String res="";
        while(!st.isEmpty()){
            res =st.pop()+res;
        }
        return res;
    }
}
