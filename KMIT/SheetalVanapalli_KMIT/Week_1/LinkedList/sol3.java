import java.util.*;

class ListNode
{
    int data;
    ListNode next;
    ListNode(int x) {
        data = x;
    }
}
public class sol3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        sol3 p = new sol3();       
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