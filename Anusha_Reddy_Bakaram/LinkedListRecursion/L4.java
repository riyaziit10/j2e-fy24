public class L4 {
    class ListNode{
        int data;
        ListNode next;
        ListNode(int val){
            data=val;
            next=null;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current= head;
        while(current != null && current.next != null) {
            if(current.data == current.next.data) {
                current.next=current.next.next;
            }
            else {
                current=current.next;
            }
        }
        return head;
    }
}
