class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prevA = null;
        ListNode nodeB = null;
        ListNode curr = list1;
        int count = 0;

        // Traverse list1 and find nodes at positions a-1 and b
        while (curr != null) {
            if (count == a - 1) {
                prevA = curr;
            }
            if (count == b) {
                nodeB = curr;
                break;
            }
            curr = curr.next;
            count++;
        }

        // Connect list1 to list2
        prevA.next = list2;

        // Find the end of list2
        while (list2.next != null) {
            list2 = list2.next;
        }

        // Connect the end of list2 to the remaining nodes in list1
        list2.next = nodeB.next;

        return list1;
    }
}

public class p8 {
    public static void main(String[] args) {
        // Create list1: [0, 1, 2, 3, 4, 5]
        ListNode list1 = new ListNode(0);
        list1.next = new ListNode(1);
        list1.next.next = new ListNode(2);
        list1.next.next.next = new ListNode(3);
        list1.next.next.next.next = new ListNode(4);
        list1.next.next.next.next.next = new ListNode(5);

        // Create list2: [1000000, 1000001, 1000002]
        ListNode list2 = new ListNode(1000000);
        list2.next = new ListNode(1000001);
        list2.next.next = new ListNode(1000002);

        Solution solution = new Solution();
        ListNode result = solution.mergeInBetween(list1, 3, 4, list2);

        // Print the result: [0, 1, 2, 1000000, 1000001, 1000002, 5]
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
