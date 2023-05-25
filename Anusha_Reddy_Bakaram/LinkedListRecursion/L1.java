import java.util.*;
class L1{
    class ListNode{
        int data;
        ListNode next;
        ListNode(int val){
            data=val;
            next=null;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++) fast = fast.next;
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
    