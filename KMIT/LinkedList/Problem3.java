/*
Problem 3:

Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the
values in the list's nodes (i.e., only nodes themselves may be changed.)


Example 1:
Input: head = [1,2,3,4] Output: [2,1,4,3]


Example 2:
Input: head = [] Output: []


Example 3:
Input: head = [1] Output: [1]


Constraints:
● The number of nodes in the list is in the range [0, 100].
● 0 <= Node.val <= 100

*/



import java.util.*;

class ListNode
{
    int data;
    ListNode next;
    ListNode(int x) {
        data = x;
    }
}
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Problem3 p = new Problem3();       
        String list[] = sc.nextLine().split(" "); 
        for(int i=0; i<list.length; i++)
        {
            p.addNode(Integer.parseInt(list[i]));
        }
        ListNode curr = p.swapPairs(p.head);
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        sc.close();
    }
    public ListNode head = null; 
    public ListNode temp = null;    
    public void addNode(int data)
    {    
        ListNode newNode = new ListNode(data);    
        if(head == null)
        {    
            head = newNode;    
            temp = newNode;    
        }    
        else 
        {    
            temp.next = newNode;    
            temp = newNode;    
        }    
    } 
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            ListNode next = curr.next.next;
            prev.next = curr.next;
            curr.next.next = curr;
            curr.next = next;
            prev = curr;
            curr = next;
        }
        return dummy.next;
    }
}

