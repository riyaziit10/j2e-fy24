package student.banasthali.abhilasha.linkedlist;


    

public class linkedlist5 {
	
    
    Node head = null;
    class Node
    {
        
     
        int val;
        Node next;
        Node(int v)
        {
            
          
            val = v;
            next = null;
        }
    }
    
    
    public void insert(int data)
    {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
    
   
    public void removeAllDuplicates()
    {
        
        
        Node dummy = new Node(0);
    
        
        dummy.next = head;
        Node prev = dummy;
        Node current = head;
    
        while (current != null)
        {
           
            while (current.next != null &&
                prev.next.val == current.next.val)
                current = current.next;
    
          
            if (prev.next == current)
                prev = prev.next;
    
           
            else
                prev.next = current.next;
    
            current = current.next;
        }
    
        head = dummy.next;
    }
    
 
    public void printList()
    {
        Node trav = head;
        if (head == null)
            System.out.print(" List is empty" );
            
        while (trav != null)
        {
            System.out.print(trav.val + " ");
            trav = trav.next;
        }
    }
    

    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();
        ll.insert(53);
        ll.insert(53);
        ll.insert(49);
        ll.insert(49);
        ll.insert(35);
        ll.insert(28);
        ll.insert(28);
        ll.insert(23);
        
        System.out.println("Before removal of duplicates");
        ll.printList();
    
        ll.removeAllDuplicates();
    
        System.out.println("\nAfter removal of duplicates");
        ll.printList();
    
    }
    
    
}
