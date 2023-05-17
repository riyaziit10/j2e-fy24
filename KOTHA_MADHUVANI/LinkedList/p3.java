class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;

            // Swapping adjacent nodes
            first.next = second.next;
            second.next = first;
            current.next = second;

            current = current.next.next;
        }

        return dummy.next;
    }
}

public class p3 {
    public static void main(String[] args) {
        // Create the linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        Solution solution = new Solution();
        ListNode result = solution.swapPairs(head);

        // Print the swapped list: 2 -> 1 -> 4 -> 3
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.println("null");
    }
}
