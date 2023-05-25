import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode head = null;
        ListNode tail = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            ListNode node = new ListNode(val);
            if (head == null) {
                head = node;
                tail = node;
            }
            else {
                tail.next = node;
                tail = node;
            }
        }
        ListNode newHead = deleteDuplicates(head);
        printList(newHead);
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        while (curr != null) {
            if (curr.val == prev.val) {
                prev.next = curr.next;
                curr = curr.next;
            }
            else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
