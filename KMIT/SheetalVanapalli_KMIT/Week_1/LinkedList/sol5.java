import java.util.*;

class ListNode
{
    int data;
    ListNode next;
    ListNode(int x) {
        data = x;
    }
}

public class sol5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        sol5 p = new sol5();       
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
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode curr = head;
        while (curr != null) {
            if (map.containsKey(curr.data)) {
                map.put(curr.data, map.get(curr.data) + 1);
            } else {
                map.put(curr.data, 1);
            }
            curr = curr.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        curr = head;
        while (curr != null) {
            if (map.get(curr.data) == 1) {
                tail.next = new ListNode(curr.data);
                tail = tail.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}