import java.util.*;
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        boolean ans = isValid(s);
        System.out.println(ans);
    }
    static boolean isValid(String s){
        Deque<Character> dq = new LinkedList<Character>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                dq.addFirst(ch);
            }
            else{
                if(dq.isEmpty()){
                    return false;
                }
                char x = dq.removeFirst();
                if(ch==')' && x!='('){
                    return false;
                }
                else if(ch=='}' && x!='{'){
                    return false;
                }
                else if(ch==']' && x!='['){
                    return false;
                }
            }
        }
        if(!dq.isEmpty()){
            return false;
        }
        return true;
    }
}
