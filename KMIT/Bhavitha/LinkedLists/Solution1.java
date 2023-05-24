/*
1 QUESTION:
Given the head of a linked list, remove the nth node from the end of the list and return its head.
SOLUTION:
*/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode t1=head;
        ListNode t2=head;
        int c=0;
        if(head.next==null)return null;
        int f=0;
        while(c<n && t1.next!=null){            
            t1=t1.next;           
            c++;
        }
        if(t1.next==null && c<n)f=1;
        while(t1.next!=null){
            t1=t1.next;
            t2=t2.next;
        }
        if(f==1){
            head=head.next;
            return head;
        }
        if(t2.next!=null )t2.next=t2.next.next;
        else t2.next=null;
        return head;
    }
}
