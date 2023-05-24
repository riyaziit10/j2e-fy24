/*
3 QUESTION:
Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
SOLUTION:
*/
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp1=head;
        ListNode temp2=head.next;
        while(temp1!=null && temp2!=null){
            int t=temp2.val;
            temp2.val=temp1.val;
            temp1.val=t;
            if(temp2.next!=null){
                temp1=temp2.next;
            }
            else{
                return head;
            }
            if(temp1.next!=null){
                temp2=temp1.next;
            }
            else{
                return head;
            }
            
        }
        return head;
    }
}
