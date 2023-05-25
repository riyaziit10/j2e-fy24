import java.util.*;
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int[] ans = nextGreaterElement(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    static int[] nextGreaterElement(int[] arr){
        int[] ans = new int[arr.length];
        Deque<Integer> dq = new LinkedList<Integer>();
        for(int i=arr.length-1;i>=0;i--){
            if(dq.isEmpty()){
                ans[i] = -1;
            }
            else if(dq.peekFirst()>arr[i]){
                ans[i] = dq.peekFirst();
            }
            else{
                while(!dq.isEmpty() && dq.peekFirst()<=arr[i]){
                    dq.removeFirst();
                }
                if(dq.isEmpty()){
                    ans[i] = -1;
                }
                else{
                    ans[i] = dq.peekFirst();
                }
            }
            dq.addFirst(arr[i]);
        }
        return ans;
    }

}
