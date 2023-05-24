/*8 QUESTION:
You are given two linked lists: list1 and list2 of sizes n and m respectively.
Remove list1's nodes from the a th node to the b th node, and put list2 in their place.
SOLUTION:
*/
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode  t1=list1;
        ListNode t2=list2;
        int c=1;
        while(c<a){
            t1=t1.next;
            c++;
        }
        ListNode t3=t1;
        while(c<=b){
            t1=t1.next;
            c++;
        }
        
        t3.next=list2;
        while(t3.next!=null){
            t3=t3.next;
        }
        t3.next=t1.next;
        return list1;
    }
    
}

