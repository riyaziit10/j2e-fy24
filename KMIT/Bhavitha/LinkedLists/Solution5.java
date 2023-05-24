/*
5 QUESTION:
Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.
SOLUTION:
*/
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode t1=new ListNode();
        t1.next=head;
        ListNode t2=t1;
        if(head==null)return null;
        else{
            while(t2.next!=null && t2.next.next!=null){
                if(t2.next.val==t2.next.next.val){
                    int b=t2.next.val;
                    while(t2.next!=null && t2.next.val==b){
                        t2.next=t2.next.next;
                    }
                }
                else t2=t2.next;
            }
            return t1.next;
        }
    }
}
