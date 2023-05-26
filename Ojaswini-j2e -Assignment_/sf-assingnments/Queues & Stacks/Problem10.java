import java.util.*;
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] tokens = new String[n];
        for(int i=0;i<n;i++){
            tokens[i] = sc.next();
        }
        sc.close();
        int ans = evalRPN(tokens);
        System.out.println(ans);
    }
    static int evalRPN(String[] tokens){
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String s = tokens[i];
            if(s.equals("+")){
                int a = st.pop();
                int b = st.pop();
                st.push(a+b);
            }
            else if(s.equals("-")){
                int a = st.pop();
                int b = st.pop();
                st.push(b-a);
            }
            else if(s.equals("*")){
                int a = st.pop();
                int b = st.pop();
                st.push(a*b);
            }
            else if(s.equals("/")){
                int a = st.pop();
                int b = st.pop();
                st.push(b/a);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}
