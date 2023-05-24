/*
2 QUESTION:
 You are given the heads of two sorted linked lists list1 and list2.Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.Return the head of the merged linked list.
SOLUTION:
*/
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1=list1;
        ListNode t2=list2;
        if(t1==null && t2==null)return null;
        if(t1==null )return t2;
        if(t2==null)return t1;
        else{
            if(t1.val<=t2.val) {
                t1.next=mergeTwoLists(t1.next,t2);
                return t1;
            }
            else{
                t2.next=mergeTwoLists(t1,t2.next);
                return t2;
            }
        }
    }
}
