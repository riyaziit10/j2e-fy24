
import java.util.*;

public class sol3 {
    static List<Integer> getMax(int []arr, int k){
        List<Integer> res = new ArrayList<>();
        Queue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        res.add(pq.peek());
        for(int i=k;i<arr.length;i++){
            pq.add(arr[i]);
            pq.remove(arr[i-k]);
            res.add(pq.peek());
        }
        return res;
    }
    public static void main(String[] args) {
        int N = 9, K = 3;
        int arr[] = {1,2, 3, 1, 4, 5, 2, 3, 6};
        System.out.println(getMax(arr, K));
    }
}
