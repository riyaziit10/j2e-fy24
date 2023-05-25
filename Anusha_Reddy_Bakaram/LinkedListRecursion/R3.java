class R3{
    class ListNode{
        int data;
        ListNode next;
        ListNode(int val){
            data=val;
            next=null;
        }
    }

        ListNode curr;
        ListNode mid;
        public void reorderList(ListNode head) {
            curr = head;
            mid = findMid(head);
            helper(head);
        }
        
        public ListNode findMid(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
        
        public void helper(ListNode head) {
            if (head == null) return;
            helper(head.next);
            if (curr == mid) {
                curr.next = null;
                return;
            }
            ListNode next = curr.next;
            curr.next = head;
            head.next = next;
            curr = next;
        } 
    }