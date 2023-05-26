import java.util.*;
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String ans = removeDuplicates(s);
        System.out.println(ans);
    }
    static String removeDuplicates(String s){
        Deque<Character> dq = new LinkedList<Character>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(dq.isEmpty()){
                dq.addFirst(ch);
            }
            else{
                if(dq.peekFirst()==ch){
                    dq.removeFirst();
                }
                else{
                    dq.addFirst(ch);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!dq.isEmpty()){
            sb.append(dq.removeLast());
        }
        return sb.toString();
    }
}
