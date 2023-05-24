/*
3.The head of a singly linked-list is given. The list can be represented as: L0 → L1 → …
→ Ln - 1 → Ln Reorder the list to be on the following form: L0 → Ln → L1 → Ln - 1 →
L2 → Ln - 2 → … The values in the list's nodes may not be modified, only nodes
themselves may be changed.
*/
class Solution {
public void reorderList(ListNode head) {
if (head == null || head.next == null) {
return;
}
ListNode tail = head;
while (tail.next != null && tail.next.next != null) {
tail = tail.next;
}
ListNode last = tail.next;
tail.next = null;
ListNode nextHead = head.next;
head.next = last;
last.next = nextHead;
reorderList(nextHead);
}
}