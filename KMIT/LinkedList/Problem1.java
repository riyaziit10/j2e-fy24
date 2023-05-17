/*
Problem 1:

Given the head of a linked list, remove the nth node from the end of the list and return its head.


Example 1:
Input: head = [1,2,3,4,5], n = 2 Output: [1,2,3,5]


Example 2:
Input: head = [1], n = 1 Output: []


Example 3:
Input: head = [1,2], n = 1 Output: [1]


Constraints:
● The number of nodes in the list is sz.
● 1 <= sz <= 30
● 0 <= Node.val <= 100
● 1 <= n <= sz
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
class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Problem1 p = new Problem1(); 
        System.out.println("head = ");      
        String list[] = sc.nextLine().split(" "); 
        for(int i=0; i<list.length; i++)
        {
            p.addNode(Integer.parseInt(list[i]));
        }
        int n = sc.nextInt();
        ListNode curr = p.removeNthFromEnd(p.head, n);
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        ListNode q = head;
        for (int i = 0; i < n; i++) {
            q = q.next;
        }
        if (q == null) {
            return head.next;
        }
        while (q.next != null) {
            p = p.next;
            q = q.next;
        }
        p.next = p.next.next;    
        return head;
    }
}