public class L5 {
    class ListNode{
        int data;
        ListNode next;
        ListNode(int val){
            data=val;
        }
        ListNode(int val,ListNode next){
            data=val;
            next=null;
        }
    }
        public ListNode deleteDuplicates(ListNode head) {
            
            ListNode l= new ListNode(0, head);
            ListNode pred = l;
            
            while (head != null) {
                if (head.next != null && head.data== head.next.data) {
                    while (head.next != null && head.data== head.next.data) {
                        head = head.next;    
                    }
                    pred.next = head.next;     
                } else {
                    pred = pred.next;    
                }
                head = head.next;    
            }  
            return l.next;
        }
    }

