import java.util.*;

public class problem3 {
    public static List<Integer> maxInContiguousSubarrays(int[] arr, int n, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }

        for (int i = k; i < n; i++) {
            result.add(arr[deque.peek()]);

            while (!deque.isEmpty() && deque.peek() <= i - k) {
                deque.removeFirst();
            }

            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }

            deque.addLast(i);
        }

        result.add(arr[deque.peek()]);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int n = 9;
        int k = 3;
        List<Integer> result = maxInContiguousSubarrays(arr, n, k);
        System.out.println(result); // Output: [3, 3, 4, 5, 5, 5, 6]

        arr = new int[] { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 };
        n = 10;
        k = 4;
        result = maxInContiguousSubarrays(arr, n, k);
        System.out.println(result); // Output: [10, 10, 10, 15, 15, 90, 90]
    }
}
