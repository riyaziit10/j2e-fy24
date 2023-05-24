import java.util.*;
class ListNode
{
    int data;
    ListNode next;
    ListNode(int x) {
        data = x;
    }
}
class sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        sol1 p = new sol1(); 
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