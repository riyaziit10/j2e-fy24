
import java.util.*;

class Problem3 {
    public static List<Integer> findMaximums(int[] arr, int k) {
        List<Integer> maximums = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }

        for (int i = k; i < arr.length; i++) {
            maximums.add(arr[deque.peekFirst()]);
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }

            deque.addLast(i);
        }
        maximums.add(arr[deque.peekFirst()]);

        return maximums;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2,3,1,4,5,2,3,6};
        int k = 3;

        List<Integer> maximums = findMaximums(arr, k);
        System.out.println( maximums);
    }
}
