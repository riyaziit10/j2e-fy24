import java.util.*;
public class L3 {
    class ListNode{
        int data;
        ListNode next;
        ListNode(int val){
            data=val;
            next=null;
        }
    }
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)  return head;
        ListNode curr = head.next.next;
        ListNode prev = head;
        head = head.next;   
        head.next = prev;
        while(curr!=null && curr.next!=null){
            prev.next = curr.next;
            prev = curr;
            ListNode nxt = curr.next.next; 
            curr.next.next = curr;
            curr = nxt;
        }
        prev.next = curr;
        return head;
    }

}
