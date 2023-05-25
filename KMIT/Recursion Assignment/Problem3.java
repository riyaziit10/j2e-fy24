import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode head = null, temp = null;
        for(int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if(head == null) {
                head = new ListNode(val);
                temp = head;
            }
            else {
                temp.next = new ListNode(val);
                temp = temp.next;
            }
        }
        reorderList(head);
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
    public static void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return;
        }
        ListNode slow = head, fast = head, prev = null;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
            fast = fast.next;
        }
        prev.next = null;
        ListNode head2 = reverse(slow);
        ListNode temp = head;
        while(head2 != null) {
            ListNode next1 = temp.next;
            ListNode next2 = head2.next;
            temp.next = head2;
            head2.next = next1;
            temp = next1;
            head2 = next2;
        }
    }
    public static ListNode reverse(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode prev = null, curr = head, next = head.next;
        while(next != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        return curr;
    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
