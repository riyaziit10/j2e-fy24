/*
Problem 2:

You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.


Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4] Output: [1,1,2,3,4,4]


Example 2:
Input: list1 = [], list2 = [] Output: []


Example 3:
Input: list1 = [], list2 = [0] Output: [0]


Constraints:
● The number of nodes in both lists is in the range [0, 50].
● -100 <= Node.val <= 100
● Both list1 and list2 are sorted in non-decreasing order.

*/


import java.util.*;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        next = null;
    }
}

public class Problem2 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }

    public static ListNode insert(ListNode head, int data) {
        ListNode new_node = new ListNode(data);
        if (head == null) {
            head = new_node;
        } 
        else {
            ListNode last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode list = null;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            list = insert(list, x);
        }
        int m = sc.nextInt();
        ListNode list1 = null;
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            list1 = insert(list1, x);
        }
        Problem2 p = new Problem2();
        ListNode mergedList = p.mergeTwoLists(list1, list);
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
        sc.close();
    }
}

