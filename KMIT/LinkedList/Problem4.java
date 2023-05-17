/*
Problem 4:

Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list
sorted as well.


Example 1:
Input: head = [1,1,2]
Output: [1,2]


Example 2:
Input: head = [1,1,2,3,3]
Output: [1,2,3]


Constraints:
● The number of nodes in the list is in the range [0, 300].
● -100 <= Node.val <= 100
● The list is guaranteed to be sorted in ascending order.

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

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Problem4 p = new Problem4();       
        String list[] = sc.nextLine().split(" "); 
        for(int i=0; i<list.length; i++)
        {
            p.addNode(Integer.parseInt(list[i]));
        }
        ListNode curr = p.deleteDuplicates(p.head);
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}