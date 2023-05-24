/*
4 QUESTION:
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
SOLUTION:
*/
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode t=head;
        while(t!=null && t.next!=null){
            if(t.val<t.next.val)t=t.next;
            else if(t.val==t.next.val)t.next=t.next.next;
        }
        return head;
    }
}

