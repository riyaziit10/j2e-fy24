import java.util.*;

public class Problem15 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,3,1,2,4,5,5,6};
        int k = 4;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i:arr){
            pq.add(i);
            if(pq.size()>k) pq.poll();
        }
        System.out.println(pq.peek());
    }
}
