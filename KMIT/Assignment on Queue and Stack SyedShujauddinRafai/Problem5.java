import java.util.*;
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[] ans = deckOfCards(n);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    static int[] deckOfCards(int n){
        int[] ans = new int[n];
        Deque<Integer> dq = new LinkedList<Integer>();
        for(int i=n;i>=1;i--){
            dq.addFirst(i);
            if(i!=1){
                int x = dq.removeLast();
                dq.addFirst(x);
            }
        }
        int i=0;
        while(!dq.isEmpty()){
            ans[i++] = dq.removeFirst();
        }
        return ans;
    }
}
