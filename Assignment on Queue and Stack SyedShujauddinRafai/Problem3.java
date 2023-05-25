import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k  = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int[] ans = max_of_subarrays(arr,n,k);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    static int[] max_of_subarrays(int[] arr,int n,int k){
        int[] ans = new int[n-k+1];
        Deque<Integer> dq = new LinkedList<Integer>();
        int i=0;
        for(;i<k;i++){
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for(;i<n;i++){
            ans[i-k] = arr[dq.peek()];
            while(!dq.isEmpty() && dq.peek()<=i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        ans[i-k] = arr[dq.peek()];
        return ans;
    }
}
